package org.example;


import java.util.Arrays;

public class StackCollection {

    private int[] arr;
    private int size;
    private int top;
    private int min = Integer.MAX_VALUE;


    public StackCollection(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }


    public void push(int n) {
        arr[++top] = n;
        if (n < min) {
            this.min = n;
        }
    }

    public int pop() {
        // removing top element ...
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top+1 == size;
    }


    public int getMin() {

        return min;
    }

    public void display() {

        for (int i =0;i<=top;i++) {
            System.out.print(arr[i]);
        }
        System.out.println(" TOP ");

    }


}
