package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.Statement;

public class JDBCConnection {

    private static Connection conn = null;

    public static Connection getConnection() {

        if (conn == null) {
            //Establish a new Connection

            try {
                FileInputStream input = new FileInputStream(JDBCConnection.class.getClassLoader().getResource("connection.properties").getFile());

                Properties props = new Properties();
                props.load(input);

                String endpoint = props.getProperty("endpoint");
                String database = props.getProperty("database");
                String schema =props.getProperty("schema");
                String url = "jdbc:postgresql://" + endpoint + "/" + database;
                System.out.println(url);
                String username = props.getProperty("username");
                String password = props.getProperty("password");



                conn = DriverManager.getConnection(url, username, password);
                String sql = String.format("SET search_path TO %s", schema);
                Statement stmt = conn.createStatement();
                stmt.execute(sql);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return conn;

    }

    //This is for testing purposes only. Not needed to actually use JDBC.
    public static void main(String[] args) {

        Connection conn1 = getConnection();
        Connection conn2 = getConnection();

        System.out.println(conn1);
        System.out.println(conn2);

    }

}