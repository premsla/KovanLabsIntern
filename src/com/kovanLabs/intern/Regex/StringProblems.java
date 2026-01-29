package com.kovanLabs.intern.Regex;
public class StringProblems {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        System.out.println("Initial value : "+sb);
        sb.append(" Programming");
        System.out.println("After append : "+sb);
        sb.insert(4," Language");
        System.out.println("After insert : "+sb);
        sb.replace(5,13,"World");
        System.out.println("After replace : "+sb);
        sb.delete(5,10);
        System.out.println("After delete : "+sb);
        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt : "+sb);
        sb.reverse();
        System.out.println("After reverse : "+sb);
        sb.reverse();
        System.out.println("Length : " +sb.length());
        System.out.println("Capacity : "+sb.capacity());
        System.out.println("Character at index 2 : "+sb.charAt(2));
        sb.setCharAt(2, 'X');
        System.out.println("After setCharAt : "+sb);
        System.out.println("Substring from index 5 : " +sb.substring(5));
        System.out.println("Substring (0 to 4) : " +sb.substring(0, 4));
        System.out.println("Index of 'Pro' : " +sb.indexOf("Pro"));
        StringBuffer sb2 = new StringBuffer("Java Java");
        System.out.println("Last index of 'Java' : " +sb2.lastIndexOf("Java"));
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity : "+sb.capacity());
        sb.setLength(4);
        System.out.println("After setLength : "+sb);
        String str = sb.toString();
        System.out.println("Converted to String : "+str);
        StringBuffer sb3 = new StringBuffer("Java");
        System.out.println("sb equals sb3 : " +sb.equals(sb3));
        System.out.println("Using toString equals : " +sb.toString().equals(sb3.toString()));
    }
}