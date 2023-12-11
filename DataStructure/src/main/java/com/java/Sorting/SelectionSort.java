package com.java.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void swap(int [] arry, int a, int b){
        int temp = arry[a];
        arry[a] = arry[b];
        arry[b] = temp;
    }
    public static void selectionSort(int [] ary)
    {
        for(int i = 0 ; i<ary.length; i ++){
            for (int j = i+1; j < ary.length ; j++) {
                if(ary[i] > ary[j]){
                    swap(ary, i, j);
                    System.out.println("Swapping: "+i+ " and "+ j+ " ");
                    System.out.println(Arrays.toString(ary));
                }
            }
        }

    }

    public static void main(String[] args) {
        int ary [] = new int[]{12, 43, 22, 11, 2, 23, 44,56, 343,54,349, 232, 44 , 23, 3};
        System.out.println(Arrays.toString(ary));
        selectionSort(ary);
    }
}
