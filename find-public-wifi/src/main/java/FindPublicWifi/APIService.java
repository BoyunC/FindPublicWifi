package FindPublicWifi;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.net.URL;

import static FindPublicWifi.WifiService.PublicWifiInsert;


public class APIService {

    private static String API_URL = "http://openapi.seoul.go.kr:8088/4456414878617264363878726f5a51/json/TbPublicWifiInfo/";
    private static OkHttpClient okHttpClient = new OkHttpClient();


    public static int getPublicWifiJson() throws IOException {

        int totalcnt = TotalCntOfwifi(); // 받아오는 Data 총 개수 구하기
        int start = 1, end = 1;
        int cnt = 0;

        try {

            for (int i = 0; i <= totalcnt / 1000; i++) {
                start = 1 + (i * 1000);
                end = (i + 1) * 1000;

                URL url = new URL(API_URL + start + "/" + end);

                Request.Builder builder = new Request.Builder().url(url).get();
                Response response = okHttpClient.newCall(builder.build()).execute();

                if (response.isSuccessful()) {
                    ResponseBody responseBody = response.body();

                    if (responseBody != null) {
                        JsonElement jsonElement = JsonParser.parseString(responseBody.string());
                        JsonArray jsonArray = jsonElement.getAsJsonObject().get("TbPublicWifiInfo").getAsJsonObject().get("row").getAsJsonArray();

                        cnt += PublicWifiInsert(jsonArray);
                    } else {
                        System.out.println("API 호출 실패 : " + response.code());
                    }
                } else {
                    System.out.println("API 호출 실패 : " + response.code());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cnt;
    }

    public static int TotalCntOfwifi() throws IOException {
        int cnt = 0;

        URL url = new URL(API_URL + "1/1");

        Request.Builder builder = new Request.Builder().url(url).get();

        Response response = okHttpClient.newCall(builder.build()).execute();

        try {
            if (response.isSuccessful()) {
                ResponseBody responseBody = response.body();

                if (responseBody != null) {
                    JsonElement jsonElement = JsonParser.parseString(responseBody.string());

                    cnt =  jsonElement.getAsJsonObject().get("TbPublicWifiInfo")
                                        .getAsJsonObject().get("list_total_count")
                                        .getAsInt();

                    System.out.println(cnt);
                }
            } else {
                System.out.println("API 호출 실패 : " + response.code());
            }
        } catch ( Exception e) {
            e.printStackTrace();
        }


        return cnt;
    }
}
