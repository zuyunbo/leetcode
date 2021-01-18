package com.example.java.day15;

public class Bsearch {

    public int bsearch(int[] a, int n, int value) {
        int low = 0;
        int hight = n - 1;
        while (low <= hight) {
            int mid = (low + hight) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                hight = mid - 1;
            }
        }
        return -1;
    }




}
