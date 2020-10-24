import java.util.*;
import java.util.stream.Collectors;

public class RansomNote {

    public static void main(String[] args) {
        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};

        String[] magazine1 = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String[] note1 = {"ive", "got", "some", "coconuts"};

        String[] magazine2 = {"two", "times", "three", "is", "not", "four"};
        String[] note2 = {"two", "times", "two", "is", "four"};

        checkMagazine(magazine2, note2);
    }

    static void checkMagazine(String[] magazine, String[] note) {

        List<String> magazineList = Arrays.asList(magazine);
        List<String> noteList = Arrays.asList(note);
        final Hashtable<String, String> hashTable = new Hashtable<>();

       /* for (String str : magazineList) {
            for (String str1 : noteList) {
                if (str.equals(str1))
                    hashTable.put(str, str1);
                else
                    hashTable.put(str, "No");
            }
        }*/

       /* for (int i = 0; i < noteList.size(); i++) {
            for (int j = 0; j < magazineList.size(); j++) {
                if (noteList.get(i).equals(magazineList.get(j)))
                    hashTable.put(noteList.get(i), magazineList.get(j));
                else
                    hashTable.put(noteList.get(i), "NO");;

            }
        }*/

        Set<Map.Entry<String, String>> entrySet = hashTable.entrySet();

        // for-each loop
        /*for (Map.Entry<String, String> entry1 : entrySet) {

            if(entry1.getKey().equals(entry1.getValue()))
            {
                System.out.println("Key : " + entry1.getKey()
                        + "\t\t Value : " + entry1.getValue());
                System.out.println("Yes");
            }else {
                System.out.println("No :");
            }
        }
*/
/*        boolean yes=  ;
        boolean yes1 = hashTable.keySet().stream()
                .allMatch(str -> str.equals(hashTable.get(str)));*/

        if (magazineList.containsAll(noteList)
                && duplicateList(magazineList).containsAll(duplicateList(noteList))) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }

    static List<String> findDuplicate(List<String> strList) {
        Set<String> allItems = new HashSet<>();
        List<String> duplicates = strList.stream()
                .filter(n -> !allItems.add(n))
                .collect(Collectors.toList());
        return duplicates;
    }

    static List<String> duplicateList(List<String> strList) {
        Set<String> allItems = new HashSet<>();
        List<String> duplicateList = new LinkedList<>();
        for (String name : strList) {
            if (allItems.add(name) == false) {
                duplicateList.add(name);
                duplicateList.add(name);
            }
          }
        return  duplicateList;
    }
}