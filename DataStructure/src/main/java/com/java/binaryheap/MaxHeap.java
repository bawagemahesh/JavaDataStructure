package com.java.binaryheap;

public class MaxHeap<T extends Comparable<T>> extends Heap<T> {

    public MaxHeap(Class<T> clazz) {
        super(clazz);
    }

    @Override
    protected void siftDown(int index) {
        System.out.println("Sifting Down: "+ getElementAtIndex(index));
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);

        //Find the larger of the left and right child Element.
        int largerIndex = -1;

        if(leftIndex != -1 && rightIndex != -1){
            T leftElement = getElementAtIndex(leftIndex);
            T rightElement = getElementAtIndex(rightIndex);

            largerIndex = leftElement.compareTo(rightElement) > 0 ? leftIndex : rightIndex;
        } else if(leftIndex != -1){
            largerIndex = leftIndex;
        } else if(rightIndex != -1){
            largerIndex = rightIndex;
        }
        //If the left and right child do not exist stop sifting down.
        if(largerIndex == -1 ){
            System.out.println("Stop sifting down found position");
            return;
        }
        System.out.println("Larger child: "+ getElementAtIndex(largerIndex));

        //Compare the larger child with the current index to see if a swap and further sift down os needed.
        if(getElementAtIndex(largerIndex).compareTo(getElementAtIndex(index)) > 0){
            swap(largerIndex, index);
            System.out.println("Swap: "+ this.toString());
            siftDown(largerIndex);
        }
    }

    @Override
    protected void siftUp(int index) {
        System.out.println("Sifting Up: "+ getElementAtIndex(index));

        int parentIndex = getParentIndex(index);

        if(parentIndex == -1) {
            System.out.println("Stop Sifting up, found position ");
            return;
        }

        System.out.println("Parent: "+ getElementAtIndex(parentIndex));

        if(getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex)) > 0) {
            swap(parentIndex, index);
            System.out.println("Swap: "+ this.toString());
            siftUp(parentIndex);
        }
    }
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
