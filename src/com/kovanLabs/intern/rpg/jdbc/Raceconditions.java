package com.example.rpg.jdbc;
import java.sql.*;

public class Raceconditions {

    static final String URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASSWORD = "Root123";

    public static void main(String[] args) {

        Runnable task = () -> {
            try {
                Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                con.setAutoCommit(false);

                PreparedStatement ps1 = con.prepareStatement(
                        "SELECT balance FROM account WHERE id = 3 FOR UPDATE"
                );

                ResultSet rs = ps1.executeQuery();

                int balance = 0;
                if (rs.next()) {
                    balance = rs.getInt("balance");
                }

                System.out.println(Thread.currentThread().getName() +
                        " Read Balance: " + balance);

                Thread.sleep(2000);

                int newBalance = balance - 500;

                PreparedStatement ps2 = con.prepareStatement(
                        "UPDATE account SET balance = ? WHERE id = 3"
                );

                ps2.setInt(1, newBalance);
                ps2.executeUpdate();

                 con.commit();

                System.out.println(Thread.currentThread().getName() +
                        " Updated Balance: " + newBalance);

                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(task, "User-1");
        Thread t2 = new Thread(task, "User-2");

        t1.start();
        t2.start();
    }

}
