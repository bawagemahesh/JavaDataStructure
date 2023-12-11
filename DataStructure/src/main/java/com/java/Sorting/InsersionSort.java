package com.java.Sorting;

import java.util.Arrays;

public class InsersionSort {

    public static void swap(int [] arry, int a, int b){
        int temp = arry[a];
        arry[a] = arry[b];
        arry[b] = temp;
    }
    public static int [] insersionSort(int [] arry){
        for (int i= 0 ; i < arry.length-1; i++){
            System.out.println("\ni : "+i);
            boolean isSwap = false;
            for (int j = i+1; j > 0; j--){
                if (arry[j] < arry[j-1]){
                   swap(arry, j, j-1);
                    System.out.println("Swapping: "+i+ " and "+ (j-1)+ " ");
                    System.out.println(Arrays.toString(arry));
                }else{
                    break;
                }
            }
        }
        return arry;
    }

    public static void main(String[] args) {
        //int ary [] = new int[]{12, 43, 22, 11, 2, 23, 44,56, 343,54,349, 232, 44 , 23, 3};
        int ary [] = new int[]{10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(ary));
        System.out.println(Arrays.toString(insersionSort(ary))); ;
    }
}
