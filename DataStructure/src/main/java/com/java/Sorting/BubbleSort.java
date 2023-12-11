package com.java.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void swap(int [] arry, int a, int b){
        int temp = arry[a];
        arry[a] = arry[b];
        arry[b] = temp;
    }
    public static int [] bubbleSort(int [] arry){
        for (int i= arry.length-1; i > 0; i--){
            boolean isSwap = false;
            for (int j = 0; j< i; j++){
                if (arry[j] > arry[j+1]){
                   swap(arry, j, j+1);
                   isSwap = true;
                    System.out.println("Swapping: "+i+ " and "+ j+ " ");
                    System.out.println(Arrays.toString(arry));
                }
            }
            if (!isSwap){
                break;
            }
        }
        return arry;
    }

    public static void main(String[] args) {
        int ary [] = new int[]{12, 43, 22, 11, 2, 23, 44,56, 343,54,349, 232, 44 , 23, 3};
        System.out.println(Arrays.toString(ary));
        System.out.println(Arrays.toString(bubbleSort(ary))); ;
    }
}
