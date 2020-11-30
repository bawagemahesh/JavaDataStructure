package Basic;

import java.util.HashMap;
import java.util.Map;

class FindSumPairs {
    //1,1 1,2  1,3  1,4  1,5  1,6
    //2,2 2,3 2,4 2,5
    //3,3 3,4
    public static void main(String[] args) {
        int[] sortedArry = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 7;
        findPair(sortedArry,sum);
    }

    public static void findPair(int [] sortedArry , int sum ) {
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, Integer> pairMap = new HashMap<>();

        int pair = 0;

        for (int i = 0; i < sortedArry.length; i++) {
            for (int k = 0; k < sortedArry.length; k++) {
                if (sortedArry[i] + sortedArry[k] <= sum) {
                    pairMap.put(sortedArry[i], sortedArry[k]);
                    if (!(pairMap.containsKey(sortedArry[k]) && pairMap.get(sortedArry[i]) == sortedArry[k])) {
                        pair = pair + 1;
                        System.out.println(sortedArry[i] + " + " + sortedArry[k]);
                    } else if (sortedArry[i] == sortedArry[k]) {
                        pair = pair + 1;
                        System.out.println("equals - " + sortedArry[i] + " + " + sortedArry[k]);
                    }
                }
            }
            System.out.println(pair);
        }
    }
}
