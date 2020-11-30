package streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {

        List<String> strList= Arrays.asList("Mahesh","Sayali", "Rohit", "Sujata", "Kittu", "Fruity");
        Map<Object, Object> listMap= listToMap(strList);
    }
//.collect(Collectors.mapping(Employee::getName, Collectors.toList()));
    private static Map<Object, Object> listToMap(List<String> strList) {
        return null; //strList.stream().collect(Collectors.mapping(str -> str, ))

    }
LinkedList

}
