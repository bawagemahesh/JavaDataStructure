package Volkswagen;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        String csv = "Sun,5,true,3";
        Scanner scanner = new Scanner(csv);
        scanner.useDelimiter(",");
        int age= scanner.nextInt();
    }
}
