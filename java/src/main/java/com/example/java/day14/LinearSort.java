package com.example.java.day14;

public class LinearSort {

    public static void main(String[] args) {
        int[] a = new int[]{2,5,3,0,2,3,0,3};
        countingSort(a,8);

        for(int s : a){
            System.out.println(s);
        }

    }


    public static void countingSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        int max = a[0];
        // 取数据的范围
        for (int i = 1; i < n; ++i) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        //申请一个计数数组
        int[] c = new int[max + 1];
        for (int i = 0; i <= max; ++i) {
            c[i] = 0;
        }
        //计算每个元素的个数，放入c中
        for (int i = 0; i < n; i++) {
            c[a[i]]++;
        }

        //依次累加
        for (int i = 1; i <= max; i++) {
            c[i] = c[i - 1] + c[i];
        }
        //临时数组r，存储排序之后的结果
        int[] r = new int[n];

        for(int i =n-1;i>=0;--i){
            int index = c[a[i]]-1;
            r[index] = a[i];
            c[a[i]]--;
        }

        for(int i=0;i<n;++i){
            a[i]=r[i];
        }
    }

}
