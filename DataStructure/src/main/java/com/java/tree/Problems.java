package com.java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Problems<T>{

    public static <T> int countNodes(Node<T> root){
        if(root == null){
            return 0;
        }
        int numOfLeftChildNodes = countNodes(root.getLeftChild());
        int numOfRightChildNodes = countNodes(root.getRightChild());
        return 1 + numOfLeftChildNodes+numOfRightChildNodes;
    }

    public static <T> int maxDepth(Node<T> root){
        if(root == null){
            return 0;
        }
        if(root.getLeftChild() == null && root.getRightChild() == null){
            System.out.println(root + " maxDepth: "+ 0);
            return 0;
        }
        int leftMaxDepth = maxDepth(root.getLeftChild());
        int rightMaxDepth = maxDepth(root.getRightChild());
       int  maxDepth = 1 + Math.max(leftMaxDepth, rightMaxDepth);
       System.out.println(root +
               " left maxDepth: "+ leftMaxDepth +
               " right maxDepth: "+ rightMaxDepth +
               " current maxDepth: "+ maxDepth );
       return  maxDepth;
    }

    public static  boolean hasPathSum(Node<Integer> root, int currentSum){
        if(root == null){
            return false;
        }
        if(root.getLeftChild() == null && root.getRightChild() == null){
            return currentSum == root.getData();
        }
        boolean hasPathSumLeft = hasPathSum(root.getLeftChild(), currentSum - root.getData());
        boolean hasPathSumRight = hasPathSum(root.getRightChild(), currentSum - root.getData());
        boolean  hasPathSum  = hasPathSumLeft || hasPathSumRight ;
        System.out.println(root +
                " hasPathSumLeft : "+ hasPathSumLeft +
                " hasPathSumRight : "+ hasPathSumRight +
                " hasPathSum : "+ hasPathSum );
        return  hasPathSum;
    }

    public static <T> void mirrorNodes(Node<T> root){
        if(root == null){
            return;
        }
        Node<T> tempNode = root.getLeftChild();
        root.setLeftChild(root.getRightChild());
        root.setRightChild(tempNode);
        mirrorNodes(root.getLeftChild());
        mirrorNodes(root.getRightChild());
    }

    public static <T> boolean isFull(Node<T> root){
        if(root == null){
            return true;
        }
        if(root.getLeftChild() == null && root.getRightChild() ==null){
            return  true;
        }
        if(root.getLeftChild() !=null && root.getRightChild() != null){
            return isFull(root.getLeftChild()) && isFull(root.getRightChild());
        }
        return false;
    }

    public static <T> int leftDepth(Node<T> root){
        int leftDepth = 0;
        Node<T> node = root;
       while (node != null){
           leftDepth++;
           node = node.getLeftChild();
       }
        return leftDepth-1;
    }


    public static <T> boolean isPerfectRecursive(Node<T> root, int leftDepth, int currentLevel){
        if(root == null){
            return true;
        }
        if(root.getLeftChild() == null && root.getRightChild() ==null){
            return  currentLevel == leftDepth;
        }
        if(root.getLeftChild() ==null || root.getRightChild() == null){
            return false;
        }
        return isPerfectRecursive(root.getLeftChild(), leftDepth, currentLevel+1) &&
                isPerfectRecursive(root.getRightChild(), leftDepth, currentLevel+1) ;
    }

    public static <T> boolean isPerfect(Node<T> root) {
        int leftDepth = leftDepth(root);
        return isPerfectRecursive(root, leftDepth, 0);
    }
}
