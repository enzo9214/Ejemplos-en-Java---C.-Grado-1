package Controller.DB;

import java.sql.*;

/**
 * Created by jhgonzalez on 6/3/17.
 * Modified by enzo on 15/07/17
 */

public class Connect {

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;



    public void actualizarData(int valueToUpdate) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test?autoReconnect=true&useSSL=false","root","");
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from person");

        } catch (Exception e) {
            System.out.println("Error trying to connect your database");
            System.out.println("This is the error: " + e.getMessage());
        } finally {
            close();
        }
    }
    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {
            System.out.println("This is the error: " + e.getMessage());
        }
    }

}