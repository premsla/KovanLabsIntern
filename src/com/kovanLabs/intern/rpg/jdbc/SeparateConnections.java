package com.example.rpg.jdbc;
import java.sql.*;
public class SeparateConnections {

        static final String URL = "jdbc:mysql://localhost:3306/testdb";
        static final String USER = "root";
        static final String PASSWORD = "Root123";

        public static void main(String[] args) throws Exception {

            Connection con1 = DriverManager.getConnection(URL, USER, PASSWORD);
            Connection con2 = DriverManager.getConnection(URL, USER, PASSWORD);

            Runnable task1 = () -> withdraw(con1, "User-1");
            Runnable task2 = () -> withdraw(con2, "User-2");

            Thread t1 = new Thread(task1);
            Thread t2 = new Thread(task2);

            t1.start();
            t2.start();
        }

        public static void withdraw(Connection con, String user) {
            try {

                con.setAutoCommit(false);

                PreparedStatement ps1 = con.prepareStatement(
                        "SELECT balance FROM account WHERE id = 16 FOR UPDATE"
                );
                ResultSet rs = ps1.executeQuery();
                int balance = 0;
                if (rs.next()) {
                    balance = rs.getInt("balance");
                }

                System.out.println(user + " Read Balance: " + balance);

                Thread.sleep(2000);

                int newBalance = balance - 500;

                PreparedStatement ps2 = con.prepareStatement(
                        "UPDATE account SET balance = ? WHERE id = 16"
                );
                ps2.setInt(1, newBalance);

                ps2.executeUpdate();

                con.commit();

                System.out.println(user + " Updated Balance: " + newBalance);

            } catch (Exception e) {
                e.printStackTrace();
                try { con.rollback(); } catch(SQLException ex) { ex.printStackTrace(); }
            }

}}
