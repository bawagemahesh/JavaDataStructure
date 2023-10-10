package com.java.binaryheap;

public class MinHeap<T extends Comparable<T>> extends Heap<T> {

    public MinHeap(Class<T> clazz) {
        super(clazz);
    }

    @Override
    protected void siftDown(int index) {
        System.out.println("Sifting Down: "+ getElementAtIndex(index));
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);

        //Find the smallar of the left and right child Element.
        int smallarIndex = -1;

        if(leftIndex != -1 && rightIndex != -1){
            T leftElement = getElementAtIndex(leftIndex);
            T rightElement = getElementAtIndex(rightIndex);

            smallarIndex = leftElement.compareTo(rightElement) < 0 ? leftIndex : rightIndex;
        } else if(leftIndex != -1){
            smallarIndex = leftIndex;
        } else if(rightIndex != -1){
            smallarIndex = rightIndex;
        }
        //If the left and right child do not exist stop sifting down.
        if(smallarIndex == -1 ){
            System.out.println("Stop sifting down found position");
            return;
        }
        System.out.println("Larger child: "+ getElementAtIndex(smallarIndex));

        //Compare the smaller child with the current index to see if a swap and further sift down os needed.
        if(getElementAtIndex(smallarIndex).compareTo(getElementAtIndex(index)) > 0){
            swap(smallarIndex, index);
            System.out.println("Swap: "+ this.toString());
            siftDown(smallarIndex);
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

        if(getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex)) < 0) {
            swap(parentIndex, index);
            System.out.println("Swap: "+ this.toString());
            siftUp(parentIndex);
        }
    }

    public static void main(String[] args) throws HeapFullException, HeapEmptyException {
        MinHeap<Integer>  minHeap = new MinHeap<>(Integer.class);
        minHeap.insert(9);
        minHeap.insert(4);
        minHeap.insert(17);
        minHeap.insert(6);
        minHeap.insert(100);
        minHeap.insert(144);
        minHeap.insert(47);
        minHeap.insert(247);
        System.out.println(minHeap);

        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println(minHeap);
        System.out.println("Higest priority element: " + minHeap.getHighestPriority());

        System.out.println();
        System.out.println(minHeap);
        minHeap.removeHighestPriority();

    }


}
