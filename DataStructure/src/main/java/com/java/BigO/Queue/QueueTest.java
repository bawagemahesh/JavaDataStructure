package com.java.BigO.Queue;

import java.util.ArrayDeque;
import java.util.Deque;


class QueueTest {

    public static void main(String[] args) {
        int a = getNumofPages(2, 6);
        System.out.println(a);
    }

   public  static int getNumofPages(int pageNum, int numofPages) {
        int pagenumber = 0;
        Deque<Integer> book = new ArrayDeque<Integer>();
        for (int i = 1; i < numofPages; i++) {
            book.add(i);
        }
        for (int i = 0; i < book.size(); i++) {
            if (book.iterator().next() == pageNum)
                pagenumber = book.iterator().next();
            else if (book.descendingIterator().next() == pageNum)
                pagenumber = book.descendingIterator().next();
        }
        return pagenumber;
    }

}
