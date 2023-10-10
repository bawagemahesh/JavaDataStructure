package com.java.Searching;

public class BinarySearch {

    public static int binarySearch(String[] list, String element) {
        System.out.println("\nSearching..." + element + ": ");


        int lowIndex = 0;
        int highEndex = list.length - 1;

        while (lowIndex <= highEndex) {
            int midIndex = (lowIndex + highEndex) / 2;
            System.out.println("Low Index: " + lowIndex + " High Index: " + highEndex +
                    " MidIndex: " + midIndex + " Mid Element: " + list[midIndex]);
            if (list[midIndex].equals(element)) {
                return midIndex;
            } else if (list[midIndex].compareTo(element) < 0) {
                lowIndex = midIndex + 1;
            } else {
                highEndex = midIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] unsortedList = new String[]{"Fiona", "Dora", "Alex",
                "Jeff", "Elise", "Irene", "Gerald", "Ben", "Harry", "Carl"};
        System.out.println("\n Element Index : " + binarySearch(unsortedList, "Alex"));

    }
}
