package com.kovanLabs.intern.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Test<T,U>{
    T obj;
    U objstr;
    Test(T obj,U objstr){
        this.obj=obj;
        this.objstr=objstr;
    }
    public void getObj(){
        System.out.println(obj);
        System.out.println(objstr);
    }


}
public class Generics {
    public static void main(String[] args){
//        Test<Integer>obj=new Test<Integer>(45);
//        Test<String>objStr=new Test<String>("Prema");
          Test<Integer,String>obj=new Test<Integer,String>(101,"Prema");
          obj.getObj();
          List<Integer>list=Arrays.asList(10,20,30);
          List<Double> list1=Arrays.asList(1.2,3.2,4.2);
          System.out.println(list);
          System.out.println(list1);
          MyStack<Integer>stack=new MyStack<>(2);
          stack.push(10);
          stack.push(20);
          stack.push(30);
          stack.push(40);
          stack.push(50);
          stack.push(60);
          stack.push(70);
          System.out.println(stack.peek());
          System.out.println(stack.pop());
          System.out.println(stack.size());

        // System.out.println(obj.getObj());
//        System.out.println(objStr.getObj());
    }
}
