package com.kovanLabs.intern.Matrix;
import java.util.*;
public class matrix {
    public static void main(String[] args){
        int[] [] a=new int[3][3];
        int[] [] b=new int[3][3];
        int[] [] c=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter elements of matrix A:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter elements of matrix B:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][i];
                }
            }
        }
        System.out.println("Result matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
