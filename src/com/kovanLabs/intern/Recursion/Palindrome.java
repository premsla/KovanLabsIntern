package com.kovanLabs.intern.Recursion;
import java.util.*;
public class Palindrome {
    static boolean isPalindrome(String s,int left,int right){
    if(left>=right) {
        return true;
    }
    if(s.charAt(left)!=s.charAt(right)){
        return false;
    }
    return isPalindrome(s,left+1,right-1);
}
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          int left=0;
          int right=s.length()-1;
          if(isPalindrome(s,left,right)){
              System.out.print("true");
          }else{
              System.out.print("false");
          }
    }
}
