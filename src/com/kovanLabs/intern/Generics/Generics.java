package com.kovanLabs.intern.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static com.kovanLabs.intern.Generics.WildCard.sum;


class Test<T, U> {
    T obj;
    U objstr;

    Test(T obj, U objstr) {
        this.obj = obj;
        this.objstr = objstr;
    }

    public void getObj() {
        System.out.println(obj);
        System.out.println(objstr);
    }
}

public class Generics {
    public static void main(String[] args) {

        Test<Integer, String> obj = new Test<Integer, String>(101, "Prema");
        obj.getObj();
        List<Integer> list = Arrays.asList(10, 20, 30);
        List<Double> list1 = Arrays.asList(1.2, 3.2, 4.2);
        System.out.println(list);
        System.out.println(list1);
        MyStack<Integer> stack = new MyStack<>(2);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek Element : " + stack.peek());
        System.out.println("Size : " + stack.size());
        System.out.println("pop Element : " + stack.pop());

        List<Integer> numlist = Arrays.asList(1, 2, 3, 4);
        System.out.print("Sum : " + sum(numlist));


    }
}
