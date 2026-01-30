package com.kovanLabs.intern.ControlFlowAlgorithm;
import java.util.*;
public class Diamond {
    public static void main(String[] args){
        System.out.print("Enter  number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid=n/2;
        for(int i=0;i<=mid;i++){
            for(int sp=0;sp<mid-i;sp++){
                System.out.print(" ");
            }
            for(int star=0;star<2*i+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=mid-1;i>=0;i--){
            for(int sp=0;sp<mid-i;sp++){
                System.out.print(" ");
            }
            for(int star=0;star<2*i+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
