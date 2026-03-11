package com.example.rpg.jdbc;
import java.sql.*;
public class MoneyTransfer {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Root123";

        Connection con = null;

        try {
            con = DriverManager.getConnection(url, user, password);

            con.setAutoCommit(false);

            con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

            PreparedStatement deductStmt = con.prepareStatement(
                    "UPDATE account SET balance = balance - ? WHERE id = ?"
            );

            PreparedStatement addStmt = con.prepareStatement(
                    "UPDATE account SET balance = balance + ? WHERE id = ?"
            );

            int amount = 200;

            deductStmt.setInt(1, amount);
            deductStmt.setInt(2, 12);
            deductStmt.executeUpdate();

            addStmt.setInt(1, amount);
            addStmt.setInt(2, 13    );
            addStmt.executeUpdate();

            con.commit();

            System.out.println("Transaction Successful!");

        } catch (Exception e) {

            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("Transaction Rolled Back!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();

        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
