package com.example.java.day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStack {

    private String[] items;

    // 元素个数
    private int count;
    // 大小
    private int n;

    public ArrayStack(String[] items, int count, int n) {
        this.items = items;
        this.count = count;
        this.n = n;
    }

    public boolean push(String item){
        if(count == n){
            return false;
        }

        items[count] = item;
        ++count;
        return true;
    }

    public String pop(){
        //栈为空
        if(count == 0) {
            return null;
        }
        String tmp = items[count-1];
        --count;
        return tmp;
    }



}
