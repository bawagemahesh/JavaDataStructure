package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {

        List<String> strList= Arrays.asList("Mahesh","Sayali", "Rohit", "Sujata", "Kittu", "Fruity");
        Map<String, Set<Integer>>listMap= listToMap(strList);
        System.out.println(listMap);
    }

    private static  Map<String, Set<Integer>> listToMap(List<String> strList) {
        Map<String, Set<Integer>> listMap1=
                strList.stream()
                        .collect(Collectors.groupingBy(String::toString,
                Collectors.mapping(String::length, Collectors.toSet())));

        Map<String, Set<Integer>> listMap=
                strList.stream()
                        .collect(Collectors.groupingBy(String::toString,
                                Collectors.mapping(String::length, Collectors.toSet())));

        return listMap1; //strList.stream().collect(Collectors.mapping(str -> str, ))

    }
}
