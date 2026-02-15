package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Z",12);
        map.put("B",33);
        map.put("C",12);
        map.put("X",33);

        System.out.println(map);
        Map<String,Integer> sorted = new TreeMap<>(map);

        System.out.println(sorted);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
