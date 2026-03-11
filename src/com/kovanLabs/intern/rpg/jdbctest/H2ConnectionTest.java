package com.example.rpg.jdbctest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class H2ConnectionTest {
    public static void main(String[] args) {
        try {
          //  org.h2.tools.Server.createWebServer().start();
            System.out.println("H2 Console started at http://localhost:8082");

            Class.forName("org.h2.Driver");
            String URL="jdbc:h2:./testdb";
            String user="sa";
            String Password="";
            Connection con = DriverManager.getConnection(URL,user,Password);

            System.out.println("Connected to H2!");

            Statement stmt = con.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS Users (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(100), " +
                    "email VARCHAR(100))");


            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
