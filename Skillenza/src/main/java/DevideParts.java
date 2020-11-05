import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DevideParts {

    public static void main(String[] args) {
        int x = 5;
        int n = 3;
        //  split(20, 6);
        System.out.println("Parts - " + split(20, 6));
    }


    public static List<Integer> splitInteger(Integer num, Integer parts) {

        return null;
    }

    static List<Integer> split(int x, int n) {
        List<Integer> parts = new ArrayList<>();
        if (x < n)
            return Collections.singletonList(-1);
        else if (x % n == 0) {
            for (int i = 0; i < n; i++)
                parts.add(x / n);

        } else {
            int zp = n - (x % n);
            int pp = x / n;
            for (int i = 0; i < n; i++) {
                if (i >= zp)
                    parts.add(pp + 1);

                 else
                    parts.add(pp);

            }
        }
        return parts;
    }
}
