package com.kovanLabs.intern.Matrix;
import java.util.*;
public class spiralMatrix {
    public static void main(String[] args) {
        ArrayList<Integer>res=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][] matrix = new int[a][b];
        System.out.println("Enter elements of mat rix:");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(top<=bottom&&left<=right){
            for(int i=top;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
            }
            left++;
        }
        System.out.print(res);
    }

}
