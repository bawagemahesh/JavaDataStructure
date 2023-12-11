package com.java.Sorting;

import java.util.Arrays;

public class ShellSort {

    public static void swap(int [] arry, int a, int b){
        int temp = arry[a];
        arry[a] = arry[b];
        arry[b] = temp;
    }

    public static void shellSort(int [] arry){
        int increment = arry.length/2;
        while ( increment >= 1){
            insersionSort(arry, increment);
            increment = increment / 2;
        }
    }

    public static void insersionSort(int [] arry, int increment){
        for (int i= 0 ; i+increment < arry.length-1; i= i+1){
            System.out.println("\ni : "+i+" increment : " +increment);
            boolean isSwap = false;
            for (int j = i+increment; j - increment >= 0 ; j = j- increment){
                if (arry[j] < arry[j- increment]){
                   swap(arry, j, j-increment);
                    System.out.println("Swapping: "+i+ " and "+ (j-increment)+ " ");
                    System.out.println(Arrays.toString(arry));
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int ary [] = new int[]{12, 43, 22, 11, 2, 23, 44,56, 343,54,349, 232, 44 , 23, 3};
        //int ary [] = new int[]{10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(ary));
        shellSort(ary);
    }
}
