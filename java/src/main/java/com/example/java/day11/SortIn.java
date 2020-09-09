package com.example.java.day11;

public class SortIn {


    public static void main(String[] args) {

        int[] z = {1, 2, 4, 6, 7, 3, 1, 4, 6, 7};

        for (int i = 0; i < z.length; i++) {
            for (int j = 1; j < z.length -1; j++) {
                if (z[j] > z[j+1]) {
                    int s = z[j];
                    z[j] = z[j+1];
                    z[j+1] = s;
                }
            }
        }

        for (int s : z) {
            System.out.println(s);
        }
    }

}
