package com.java.Searching;

public class JumpSearch {

    public static int jumpSearch(String[] list, String element, int jumpLength) {
        System.out.println("\nSearching..." + element + ": ");

        int i = 0;

        while (list[i].compareTo(element) <= 0) {
            System.out.println("Element is greater than or equal to: " + list[i]);
            i = i + jumpLength;
            if(i >= list.length){
                break;
            }
        }
        int startIndex = i - jumpLength;
        int endIndex = Math.min(i, list.length);

        System.out.println("Looking between: "+ startIndex + " and: "+endIndex);

        for (int j = startIndex; j < endIndex; j++) {
            if(list[j].equals(element)){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] unsortedList = new String[]{ "Alex","Ben","Carl","Dora",
                 "Elise", "Fiona","Gerald","Harry", "Irene", "Jeff"};
        System.out.println("\n Element Index : " + jumpSearch(unsortedList, "Alex", 5));

    }
}
