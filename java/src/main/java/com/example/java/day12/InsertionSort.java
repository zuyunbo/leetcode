package com.example.java.day12;

public class InsertionSort {


    public static void main(String[] args) {
        int[] a = new int[]{4,5,6,1,2,3};
        insertionSort(a,6);

        for(int s : a){
            System.out.println(s);
        }

    }

    public static void insertionSort(int[] a ,int b){
        for(int i = 1; i<b;i++){
            int value = a[i];
            int j = i - 1;
            for(;j>=0;--j){
               if(a[j]>value){
                   a[j+1] = a[j];
               }else {
                   break;
               }
            }
            a[j+1] = value;
        }
    }

}
