package SortingAlgorithm;

public class BubbleSort {

    public int [] bubbleSort(int [] arry){
        for (int i=0; i< arry.length-1; i++){
            for (int j = i+1; j< arry.length-1-1; j++){
                if (arry[j]>arry[j+1]){
                    int tmp= arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=tmp;
                }
            }
        }
        return arry;
    }
}
