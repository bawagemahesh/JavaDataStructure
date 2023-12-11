package com.java.Searching;

import java.util.Arrays;

public class LinearSearch {
  public static int  linearSearch(String[] list, String element){
        System.out.println("\nSearching..."+element +": ");
      for (int i = 0; i < list.length ; i++) {
          System.out.println(i + " ");
          if(list[i].equals(element)){
              return i;
          }
      }
      return  -1;
    }

    public static void main(String[] args) {
        String[] unsortedList = new String[]{"Fiona","Dora","Alex",
                "Jeff","Elise","Irene", "Gerald","Ben","Harry","Carl"};
        System.out.println("\n Element Index : "+linearSearch(unsortedList, "A"));

    }
}
