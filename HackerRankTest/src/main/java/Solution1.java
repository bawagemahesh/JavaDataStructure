import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Solution1 {
    public static void main(String[] args) throws IOException {
        int[] arry = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        sockMerchant(arry.length, arry);
    }

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        List<Integer> inList = new ArrayList<>();
        Arrays.stream(ar).forEach(i -> inList.add(i));
        Map<Integer, Long> result = duplicateMapper(inList);
        int pair = 0;
        for (Map.Entry<Integer, Long> entry : result.entrySet()) {
            if (entry.getValue() % 2 == 0 || entry.getValue() % 2 == 1 && entry.getValue() > 1) {
                pair = (int) (entry.getValue() / 2);
            }
        }

        return pair;
    }

    public static <T> Map<T, Long> duplicateMapper(List<T> list) {
        Map<T, Long> intMaop = list.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting()));
        return intMaop;

    }

    public static int countingValleys(int steps, String path) {
        int dcount = 0;
        int ccount = 0;
        int size= path.length();
        for (int i = 0; i < size; i++) {
            if (path.charAt(i) == 'D') {
                dcount += dcount;
            } else if (path.charAt(i) == 'U') {
                ccount += ccount;
            }
            if(size/2 == dcount && size/2 == ccount){
                return 1;
            }

        }
        return 0;
    }
}

