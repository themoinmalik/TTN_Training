package org.example;


import java.util.Arrays;

public class StackCollection {

    private int[] arr;
    private int size;
    private int top;


    public StackCollection(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }


    public void push(int n) {
        arr[++top] = n;
    }

    public int pop() {
        // removing top element ...
        return arr[top--];
    }


    public void display() {

        System.out.println(Arrays.toString(arr));

    }


}
