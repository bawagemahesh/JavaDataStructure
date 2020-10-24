package Volkswagen;

public class Test3 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int i = 5;
        arr[i++] = ++i+i++;
        System.out.println(arr[5]+":"+arr[6]);
    }
}
