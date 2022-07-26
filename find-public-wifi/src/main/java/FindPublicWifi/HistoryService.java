package FindPublicWifi;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.sql.*;

public class HistoryService {

    public static Connection connection;
    public static PreparedStatement preparedStatement;
    public static ResultSet resultSet;

    public static void searchHistoryInsert(String lat, String lnt) {

        connection = null;
        preparedStatement = null;
        resultSet = null;
        int cnt = 0;


        try {

            connection = DBConnect.connectDB();

            String sql = " insert ignore into search_history "
                    + " ( lat, lnt ) "
                    + " values ( ?, ? ); ";


            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, lat);
            preparedStatement.setString(2, lnt);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnect.close(connection, preparedStatement, resultSet);
        }

    }
}
