package com.kovanLabs.intern.Matrix;

import java.util.*;

public class CompoundInterestJaggedEMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Annual Interest Rate (%): ");
        double annualRate = sc.nextDouble();
        System.out.print("Enter Number of Months: ");
        int months = sc.nextInt();
        double r = annualRate / (12 * 100);
        double emi = calculateEMI(principal, r, months);
        double[][] emiMatrix = generateEMIMatrix(principal, r, months, emi);
        printEMITable(principal, r, months, emi);
        printJaggedMatrix(emiMatrix);
    }

    static double calculateEMI(double principal, double r, int months) {
        return (principal * r * Math.pow(1 + r, months)) /
                (Math.pow(1 + r, months) - 1);
    }

    static double[][] generateEMIMatrix(double principal, double r, int months, double emi) {
        int rows = (int) Math.ceil(months / 12.0);
        double[][] emiMatrix = new double[rows][];
        int remaining = months;
        double balance = principal;
        for (int i = 0; i < rows; i++) {
            int cols = Math.min(12, remaining);
            emiMatrix[i] = new double[cols];
            for (int j = 0; j < cols; j++) {
                double interest = balance * r;
                double principalPaid = emi - interest;
                balance -= principalPaid;
                emiMatrix[i][j] = emi;
            }
            remaining -= cols;
        }
        return emiMatrix;
    }

    static void printEMITable(double principal, double r, int months, double emi) {
        double balance = principal;
        int month = 1;
        System.out.println("\nMonth | EMI | Interest | Principal | Balance");
        for (int i = 1; i <= months; i++) {
            double interest = balance * r;
            double principalPaid = emi - interest;
            balance -= principalPaid;
            System.out.printf("%5d | %.2f | %.2f | %.2f | %.2f\n", month, emi, interest, principalPaid, balance);
            month++;
        }
    }

    static void printJaggedMatrix(double[][] emiMatrix) {
        System.out.println("\nEMI Jagged Matrix (Year-wise):");
        for (int i = 0; i < emiMatrix.length; i++) {
            for (int j = 0; j < emiMatrix[i].length; j++) {
                System.out.printf("%.2f ", emiMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
