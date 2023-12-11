package TechGig;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String values = "Word1 Word2 Word3 Word4";
        String [] vals = values.split(" ");
        Arrays.sort(vals);
        for(String i: vals)
            System.out.print(i);

    }
}
