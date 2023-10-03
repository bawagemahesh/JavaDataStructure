package com.java.tree;

import java.util.*;

public class DeptFirst {
    public static <T> void inOrderStack(Node<T> root){
        if(root == null){
            return;
        }
        Set<Node<T>> visitedNodes = new HashSet<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node<T> top = stack.pop();
            if (top.getLeftChild() == null && top.getLeftChild() == null) {
                System.out.print(top + "->");
            } else if (visitedNodes.contains(top)) {
                System.out.print(top + "->");
            } else {
                visitedNodes.add(top);
                if (top.getRightChild() != null) {
                    stack.push(top.getRightChild());
                }
                stack.push(top);
                if (top.getLeftChild() != null) {
                    stack.push(top.getLeftChild());
                }
            }
        }
    }
    public static <T> void inOrderRecurrsion(Node<T> root) {
        if (root == null) {
            return;
        }
        inOrderRecurrsion(root.getLeftChild());
        System.out.print(root.getData() + "->");
        inOrderRecurrsion(root.getRightChild());
    }
}
