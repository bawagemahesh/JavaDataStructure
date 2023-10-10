package com.java.tree;

public class BinarySearch {

    public static Node<Integer> insert(Node<Integer> root, int data){
        if(root == null){
            return new Node<>(data);
        }
        if(data <= root.getData()){
            root.setLeftChild(insert(root.getLeftChild(), data));
        }else {
            root.setRightChild(insert(root.getRightChild(), data));
        }
        return root;
    }

    public static Node<Integer> lookup(Node<Integer> root, int data){
        if(root == null){
            return new Node<>(data);
        }
        if(root.getData() == data){
            return root;
        }

        if(data <= root.getData()){
            System.out.print(data + " <= "+ root.getData() + " looking in the left subtree ");
            return lookup(root.getLeftChild(), data);
        }else {
            System.out.print(data + " > "+ root.getData() + " looking in the right subtree ");
            return lookup(root.getRightChild(), data);
        }
    }

    public static Integer minValue(Node<Integer> root){
        int minValue = Integer.MAX_VALUE;
       while(root != null){
           minValue = root.getData();
           System.out.println("Currently at node: "+ minValue + " going into the left subtree ");
           root = root.getLeftChild();
       }
       return  minValue;
    }

    public static Integer maxValue(Node<Integer> root){
        int maxValue = Integer.MIN_VALUE;
        while(root != null){
            maxValue = root.getData();
            System.out.println("Currently at node: "+ maxValue + " going into the right subtree ");
            root = root.getRightChild();
        }
        return  maxValue;
    }

    public static void printRange(Node<Integer> root, int low, int high) {
        if (root == null) {
            return ;
        }
        if(low <= root.getData()){
            printRange(root.getLeftChild(), low, high);
        }
        if(low<= root.getData() && root.getData() <= high){
            System.out.println(root.getData());
        }
        if(high > root.getData()){
            printRange(root.getRightChild(), low, high);
        }
    }

}
