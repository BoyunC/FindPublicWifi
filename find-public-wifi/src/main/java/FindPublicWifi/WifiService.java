package FindPublicWifi;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.sql.*;

public class WifiService {

    public WifiService() {

    }
    public static int PublicWifiInsert(JsonArray jsonArray) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int cnt = 0;


        try {

            connection = DBConnect.connectDB();

            String sql = " insert ignore into public_wifi "
                    + " ( x_swifi_mgr_no, x_swifi_wrdofc, x_swifi_main_nm, x_swifi_adres1,x_swifi_adres2, "
                    + " x_swifi_instl_floor, x_swifi_instl_ty, x_swifi_instl_mby, x_swifi_svc_se, x_swifi_cmcwr, "
                    + " x_swifi_cnstc_year, x_swifi_inout_door, x_swifi_remars3, lat, lnt, work_dttm) "
                    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";


            preparedStatement = connection.prepareStatement(sql);

            for ( int i = 0; i < jsonArray.size(); i++){

                JsonObject data = (JsonObject) jsonArray.get(i).getAsJsonObject();

                preparedStatement.setString(1,  data.get("X_SWIFI_MGR_NO").getAsString());
                preparedStatement.setString(2,  data.get("X_SWIFI_WRDOFC").getAsString());
                preparedStatement.setString(3,  data.get("X_SWIFI_MAIN_NM").getAsString());
                preparedStatement.setString(4,  data.get("X_SWIFI_ADRES1").getAsString());
                preparedStatement.setString(5,  data.get("X_SWIFI_ADRES2").getAsString());
                preparedStatement.setString(6,  data.get("X_SWIFI_INSTL_FLOOR").getAsString());
                preparedStatement.setString(7,  data.get("X_SWIFI_INSTL_TY").getAsString());
                preparedStatement.setString(8,  data.get("X_SWIFI_INSTL_MBY").getAsString());
                preparedStatement.setString(9,  data.get("X_SWIFI_SVC_SE").getAsString());
                preparedStatement.setString(10, data.get("X_SWIFI_CMCWR").getAsString());
                preparedStatement.setString(11, data.get("X_SWIFI_CNSTC_YEAR").getAsString());
                preparedStatement.setString(12, data.get("X_SWIFI_INOUT_DOOR").getAsString());
                preparedStatement.setString(13, data.get("X_SWIFI_REMARS3").getAsString());
                preparedStatement.setString(14, data.get("LAT").getAsString());
                preparedStatement.setString(15, data.get("LNT").getAsString());
                preparedStatement.setTimestamp(16, Timestamp.valueOf(data.get("WORK_DTTM").getAsString()));

                preparedStatement.addBatch();

                preparedStatement.clearParameters() ;
            }

            cnt = preparedStatement.executeBatch().length;
            System.out.println("result = " + cnt);
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnect.close(connection, preparedStatement, resultSet);
        }

        return cnt;
    }
}
