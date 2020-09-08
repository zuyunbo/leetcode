package com.example.java.day10;

public class CircularQueue {

    private String[] items;

    private int n = 0;

    private int head = 0;

    private int tail = 0;

    public CircularQueue(int capacity) {
        items = new String[capacity];
         n = capacity;
    }

    public boolean enqueue(String item){
        if((tail+1)%n==head){
            return false;
        }
        items[tail] = item;
        tail = (tail+1)%n;
        return true;
    }

}
