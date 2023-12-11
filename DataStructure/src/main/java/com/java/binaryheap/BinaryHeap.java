package com.java.binaryheap;

public class BinaryHeap {

    public static void main(String[] args) throws HeapEmptyException, HeapFullException {

        MaxHeap<Integer>  maxHeap = new MaxHeap<>(Integer.class);
//        maxHeap.insert(9);
//        System.out.println(maxHeap);
//
//        System.out.println();
//        maxHeap.insert(4);
//        System.out.println(maxHeap);
//
//        System.out.println();
//        maxHeap.insert(17);
//        System.out.println(maxHeap);
//
//        System.out.println();
//        maxHeap.insert(6);
//        System.out.println(maxHeap);
//
//        System.out.println();
//        maxHeap.insert(100);
//        System.out.println(maxHeap);

        maxHeap.insert(9);
        maxHeap.insert(4);
        maxHeap.insert(17);
        maxHeap.insert(6);
        maxHeap.insert(100);
        maxHeap.insert(144);
        maxHeap.insert(47);
        maxHeap.insert(247);
        System.out.println(maxHeap);

        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println(maxHeap);
        System.out.println("Higest priority element: " + maxHeap.getHighestPriority());

    }
}
