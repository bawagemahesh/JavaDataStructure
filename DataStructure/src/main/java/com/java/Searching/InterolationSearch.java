package com.java.Searching;

public class InterolationSearch {

    public static int binarySearch(int[] list, int element) {
        System.out.println("\nSearching..." + element + ": ");

        int lowIndex = 0;
        int highEndex = list.length - 1;

        while (lowIndex <= highEndex) {
            int midIndex = lowIndex + ((element - list[lowIndex]) * (highEndex - lowIndex)) / (list[highEndex] - list[lowIndex]);

            System.out.println("Low Index: " + lowIndex + " High Index: " + highEndex +
                    " MidIndex: " + midIndex + " Mid Element: " + list[midIndex]);
            if (list[midIndex] == element) {
                return midIndex;
            } else if (list[midIndex] < element) {
                lowIndex = midIndex + 1;
            } else {
                highEndex = midIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedList = new int[]{1, 2, 3, 4, 5, 6, 7,8, 9};
        System.out.println("\n Element Index : " + binarySearch(sortedList, 2));

    }
}
