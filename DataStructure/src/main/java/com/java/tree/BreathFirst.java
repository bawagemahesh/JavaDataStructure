package com.java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BreathFirst {
    public static <T> void breathFirstWithQueue(Node<T> root){
        if(root == null){
            return;
        }
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node<T>  node = queue.remove();
            System.out.print(node + "->");
            if(node.getLeftChild() !=null){
                queue.add(node.getLeftChild());
            }
            if(node.getRightChild() != null){
                queue.add(node.getRightChild());
            }
        }
    }

    public static <T> void breathFirstWithPair(Node<T> root){
        if(root == null){
            return;
        }
        Queue<Pair<Node<T>, Integer>> queue = new LinkedList<>();
        int level = 0;
        queue.add(new Pair<>(root, level));

        while (!queue.isEmpty()){
            Pair<Node<T>, Integer>  pair = queue.remove();
            System.out.print(pair + "->");

            level = pair.getValue() +1;
            Node<T> leftChild = pair.getKey().getLeftChild();
            if(leftChild !=null){
                queue.add( new Pair<>(leftChild, level));
            }
            Node<T> rightChild = pair.getKey().getRightChild();
            if(rightChild != null){
                queue.add(new Pair<>(rightChild, level));
            }
        }
    }
}
