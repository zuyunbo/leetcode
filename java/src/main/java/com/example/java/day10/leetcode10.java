package com.example.java.day10;

public class leetcode10 {

    public static void main(String[] args) {

/*
        System.out.println(f(7));
*/

        System.out.println(t(7));

    }

    static  int f(int n){
        int ret = 1;

        for(int i = 2;i<=n ;i++){
            ret = ret +1;
        }
        return ret;
    }

    static int t(int n){
        if(n ==1){
            return 1;
        }
        if(n ==2){
            return 2;
        }
        int ret = 0;
        int pre = 2;
        int prepre = 1;

        for(int i = 3;i<=n;i++){
            ret = pre +prepre;
            prepre=pre;
            pre = ret;
        }

        return  ret;
    }

}
