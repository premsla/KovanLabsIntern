package com.kovanLabs.intern.Recursion;
import java.util.*;
public class Fibonacci {

        static int[] memo;  // stores computed Fibonacci values

        static int fib(int n) {
            // base cases
            if (n == 0) return 0;
            if (n == 1) return 1;

            // if already calculated, return it
            if (memo[n] != -1) {
                return memo[n];
            }

            // calculate, store, and return
            memo[n] = fib(n - 1) + fib(n - 2);
            return memo[n];
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            memo = new int[n + 1];
            Arrays.fill(memo, -1); // initialize with -1

            System.out.println(fib(n));
        }



}
