package com.java.tree;

import static com.java.tree.BinarySearch.insert;

public class MainBinarySearchProblem {
    public static void main(String[] args) {

        Node<Integer> eight = new Node<>(8);
        insert(eight, 3);
        insert(eight, 10);
        insert(eight, 1);
        insert(eight, 14);
        insert(eight, 4);
        insert(eight, 7);
        insert(eight, 13);

        System.out.println("\n########### 16. BinarySearch.insert(alice); ########### ");
        BreathFirst.breathFirstWithPair(eight);
        System.out.println("\n\n InOrder");
        DeptFirst.inOrderRecurrsion(eight);
        System.out.println("\n########### 16. BinarySearch.lookup(eight, 6); ########### ");
        BinarySearch.lookup(eight, 6);
    }



}
