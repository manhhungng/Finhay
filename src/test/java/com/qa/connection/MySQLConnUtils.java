package com.qa.connection;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnUtils {

    public static Connection getMySQLConnection() {
     //  String hostName = "192.168.1.32";
        String hostName = "27.72.103.119";
        String dbName = "finhaydb";
        String userName = "finhay";
        String password = "finhay1414";
        return getMySQLConnection(hostName, dbName, userName, password);

    }

    public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
            conn = DriverManager.getConnection(connectionURL, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Connection extracted(MySQLConnUtils query) throws SQLException, ClassNotFoundException {
        String hostName = "27.72.103.119";
        String userName = "finhay";
        String password = "finhay1414";
        String dbName = "finhaydb";
        return query.getMySQLConnection(hostName, dbName, userName, password);
    }

    // Send data query to Database or data input to DB ==> Create_Query
    public static void CreateQuery(String sql) throws Exception {
        MySQLConnUtils.getMySQLConnection().createStatement();
        System.out.println(sql);

    }

    // Executes_query --> from created query
    public static void ExecuteQuery(String sql) throws Exception {

        ResultSet result = MySQLConnUtils.getMySQLConnection().createStatement().executeQuery(sql);
        result.beforeFirst();
        result.next();
        String foundType = result.getString(1);
        System.out.println(foundType);

    }

}