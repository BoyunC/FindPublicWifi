package FindPublicWifi;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class HistoryService {

    public static Connection connection;
    public static PreparedStatement preparedStatement;
    public static ResultSet resultSet;

    public static void searchHistoryInsert(String lat, String lnt) {

        connection = null;
        preparedStatement = null;
        resultSet = null;

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


    public List<HistoryDTO> getSearchHistoryList() {

        connection = null;
        preparedStatement = null;
        resultSet = null;

        List<HistoryDTO> historyList = new LinkedList<>();

        try {

            connection = DBConnect.connectDB();

            String historySelectSQL = " select * "
                    + " from search_history "
                    + " where 'delete' = false "
                    + " order by id desc; ";


            preparedStatement = connection.prepareStatement(historySelectSQL);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                HistoryDTO historyDTO = new HistoryDTO(
                        resultSet.getInt("id")
                        , resultSet.getString("lat")
                        , resultSet.getString("lnt")
                        , resultSet.getTimestamp("search_dttm").toLocalDateTime()
                );


                historyList.add(historyDTO);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnect.close(connection, preparedStatement, resultSet);
        }


        return historyList;
    }
}
