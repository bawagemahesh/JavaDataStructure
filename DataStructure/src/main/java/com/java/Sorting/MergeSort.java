package com.java.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void swap(int [] arry, int a, int b){
        int temp = arry[a];
        arry[a] = arry[b];
        arry[b] = temp;
    }

    public static void split(String[] listToSort, String[] listFirstHalf, String[] listSecondHalf){
        int secondHalfStartIndex = listFirstHalf.length;

        for (int index = 0; index < listToSort.length; index++) {
            if(index < secondHalfStartIndex){
                listFirstHalf[index] = listToSort[index];
            }else {
                listSecondHalf[index - secondHalfStartIndex] = listToSort[index];
            }
        }
    }
    public static void merge(String[] listToSort, String[] listFirstHalf, String[] listSecondHalf) {
        int mergeIndex = 0;

        int firstHalfIndex = 0;
        int secondHalfIndex = 0;

        while (firstHalfIndex < listFirstHalf.length && secondHalfIndex < listSecondHalf.length){

            if(listFirstHalf[firstHalfIndex].compareTo(listSecondHalf[secondHalfIndex]) < 0){
                listToSort[mergeIndex] = listFirstHalf[firstHalfIndex];
                firstHalfIndex++;
            } else  if(secondHalfIndex < listSecondHalf.length){
                listToSort[mergeIndex] = listSecondHalf[secondHalfIndex];
                secondHalfIndex++;
            }
            mergeIndex++;
        }
        if(firstHalfIndex < listFirstHalf.length){
            while (mergeIndex < listToSort.length){
                listToSort[mergeIndex++] = listFirstHalf[firstHalfIndex++];
             }
        }
        if(secondHalfIndex < listSecondHalf.length){
            while (mergeIndex < listToSort.length){
                listToSort[mergeIndex++] = listSecondHalf[secondHalfIndex++];
            }
        }

    }

    public static void mergeSort(String [] listToSort){
        if(listToSort.length == 1){
            return;
        }

        int midIndex = listToSort.length/2 + listToSort.length % 2;

        String[] listFirstHalf = new String[midIndex];
        String[] listSecondHalf = new String[listToSort.length - midIndex];

        split(listToSort, listFirstHalf, listSecondHalf);

        System.out.println("\n Split: "+Arrays.toString(listFirstHalf) + "    "+
                Arrays.toString(listSecondHalf));
        mergeSort(listFirstHalf);
        mergeSort(listSecondHalf);

        merge(listToSort, listFirstHalf, listSecondHalf);

        System.out.println("\nMerged: "+ Arrays.toString(listToSort));
    }

    public static void main(String[] args) {
        //int ary [] = new int[]{12, 43, 22, 11, 2, 23, 44,56, 343,54,349, 232, 44 , 23, 3};
        String[] unsortedList = new String[]{"Fiona","Dora","Alex",
                "Jeff","Elise","Irene", "Gerald","Ben","Harry","Carl"};
        System.out.println(Arrays.toString(unsortedList));
        mergeSort(unsortedList);
    }
}
