package com.java.binaryheap;

import java.util.Arrays;

public class HeapSort {
    public static int getParentIndex(int index, int endIndex){
        if (index < 0 || index > endIndex){
            return  -1;
        }
        return (index -1 ) / 2;
    }

    public static int getLeftChildIndex(int index, int endIndex){
        int leftChildIndex = 2 * index + 1;
        if (leftChildIndex > endIndex){
            return  -1;
        }
        return leftChildIndex;
    }

    public static int getRightChildIndex(int index, int endIndex){
        int rightChildIndex = 2 * index + 2;
        if (rightChildIndex > endIndex){
            return  -1;
        }
        return rightChildIndex;
    }
    protected static void swap(int[] array, int index1, int index2){
        int temp = array[index1] ;
        array[index1] = array[index2];
        array[index2] = temp;
    }


    protected static void percolateDown(int[] array, int index, int endIndex) {
        System.out.println("Percolating Down: "+ array[index]);

        int leftChildIndex = getLeftChildIndex(index, endIndex);
        int rightChildIndex = getRightChildIndex(index, endIndex);

        //Find the larger of the left and right child Element.
        int largerIndex = -1;

        if(leftChildIndex != -1 && rightChildIndex != -1){
            largerIndex = array[leftChildIndex] > array[rightChildIndex] ? leftChildIndex : rightChildIndex;
        } else if(leftChildIndex != -1){
            largerIndex = leftChildIndex;
        } else if(rightChildIndex != -1){
            largerIndex = rightChildIndex;
        }
        //If the left and right child do not exist stop sifting down.
        if(largerIndex == -1 ){
            System.out.println("Stop sifting down found position");
            return;
        }
        System.out.println("Larger child: "+ array[index]);

        //Compare the larger child with the current index to see if a swap and further sift down os needed.
        if(array[largerIndex] > array[index]){
            swap(array, largerIndex, index);
            System.out.println("Swap: "+ Arrays.toString(array));
            percolateDown(array, largerIndex, endIndex);
        }
    }

    public static void heapify(int[] array, int endIndex){
       int index = getParentIndex(endIndex, endIndex);

        System.out.println("Child: "+ array[endIndex]);
        System.out.println("Parent: "+ array[index]);

       while (index >= 0){
           System.out.println("\n Percolating Index: "+ index + " Array: "+ Arrays.toString(array));
           percolateDown(array, index, endIndex);
           index--;
       }
    }

    public static void heapSort(int[] array){
        heapify(array, array.length - 1);

        int endIndex = array.length - 1;
        while (endIndex > 0){
            System.out.println("\n End of Heap: "+ array[endIndex]+ " Array: "+ Arrays.toString(array));
            System.out.println("\n Move: "+ array[0] + " to the end");
            swap(array, 0, endIndex);
            System.out.println("\n After Swap: "+ Arrays.toString(array));

            endIndex--;
            percolateDown(array, 0, endIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 6, 9, 2, 10, 56, 12, 5, 1, 17, 14};
        System.out.println(Arrays.toString(array));
        //heapify(array, array.length -1);
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
