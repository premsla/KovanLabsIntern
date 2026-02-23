package com.kovanLabs.intern.Generics;

import java.util.*;

class MyStack<T> {
    private T[] arr;
    private int top;
    private int capacity;

    public MyStack(int size) {
        capacity = size;
        arr = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T value) {
        if (top == capacity - 1) {
            resize();
        }
        arr[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("stack is Empty");
        }
        return arr[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    private void resize() {
        capacity = capacity * 2;
        T[] newArr = (T[]) new Object[capacity];
        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

}
