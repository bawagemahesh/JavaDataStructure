package com.java.Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void swap(String [] arry, int a, int b){
        String temp = arry[a];
        arry[a] = arry[b];
        arry[b] = temp;
    }

    public static int partition(String[] listToSort, int lowIndex, int highindex){
        String pivot = listToSort[lowIndex];

        int low = lowIndex;
        int high = highindex;

        System.out.println("\n Pivot = "+pivot);
        while (low < high){
            while (listToSort[low].compareTo(pivot) <= 0 && low < high){
                low++;
            }
            while (listToSort[high].compareTo(pivot) > 0){
                high--;
            }
            if(low < high) {
                swap(listToSort, low, high);
                System.out.println("Swapping: " + low + " and " + high + " ");
                System.out.println(Arrays.toString(listToSort));
            }
        }
        if(low != high) {
            swap(listToSort, low, high);
            System.out.println("Swapping: " + low + " and " + high + " ");
            System.out.println(Arrays.toString(listToSort));
        }
        System.out.println("\nPartitioned:  "+Arrays.toString(listToSort) + " around pivot: "+ pivot);

        return  high;
    }

    public static void quickSort(String [] listToSort, int lowIndex, int highIndex){
        if( lowIndex >= highIndex){
            return;
        }
        int pivotIndex = partition(listToSort, lowIndex, highIndex);
        quickSort(listToSort, lowIndex, pivotIndex-1);
        quickSort(listToSort, pivotIndex + 1, highIndex);
    }

    public static void main(String[] args) {
        //int ary [] = new int[]{12, 43, 22, 11, 2, 23, 44,56, 343,54,349, 232, 44 , 23, 3};
        String[] unsortedList = new String[]{"Fiona","Dora","Alex",
                "Jeff","Elise","Irene", "Gerald","Ben","Harry","Carl"};
        System.out.println(Arrays.toString(unsortedList));
        quickSort(unsortedList, 0, unsortedList.length - 1 );
    }
}
