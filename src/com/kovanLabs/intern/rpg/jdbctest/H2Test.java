package com.example.rpg.jdbctest;
import java.sql.Connection;
import java.sql.DriverManager;
public class H2Test {
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
            Connection con = DriverManager.getConnection("jdbc:h2:./testdb", "sa", "");
            System.out.println("H2 Connected Successfully!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
