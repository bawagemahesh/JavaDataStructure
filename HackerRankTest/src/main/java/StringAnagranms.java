import java.util.*;
import java.util.stream.Stream;

public class StringAnagranms {

    public static void main(String[] args) {
        List<String> dictionery = new LinkedList<String>();
        dictionery.add("hack");
        dictionery.add("a");
        dictionery.add("rank");
        dictionery.add("khac");
        dictionery.add("ackh");
        dictionery.add("kran");
        dictionery.add("rankhacker");
        dictionery.add("a");
        dictionery.add("ab");
        dictionery.add("ba");
        dictionery.add("stairs");
        dictionery.add("raits");

        List<String> query = new LinkedList<String>();
        query.add("a");
        query.add("nark");
        query.add("bs");
        query.add("hack");
        query.add("stair");

        // List<Integer> found  = getAllCount(dictionery,query);

        // System.out.println(found);

        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};

        String[] magazine1 = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String[] note1 = {"ive", "got", "some", "coconuts"};


    }


    private static List<Integer> getAllCount(List<String> dictionery, List<String> query) {

        List<Integer> integers = new LinkedList<Integer>();
        int count = 0;

           /* for (int i = 0; i <query.size(); i++) {
                for (int j = 0; j <dictionery.size(); j++) {
                    if (isAnagram(query.get(i), dictionery.get(j))) {
                        count = count +1;
                    }
                }
            integers.add(count);
                count=0;
        }*/

        for (String q : query) {
            for (String d : dictionery) {
                if (isAnagram(q, d)) {
                    count = count + 1;
                }
            }
            integers.add(count);
            count = 0;
        }
        //   integers.add(count);
        return integers;
    }

    private static boolean isAnagram(String s1, String s2) {
        boolean status;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        return status;
    }


}
