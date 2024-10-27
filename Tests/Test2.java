package Tests;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        Map<String,Integer> hashMap =new HashMap<>();
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);
        hashMap.put("five",5);
        hashMap.put("four",4);

        LinkedHashMap<String, Integer> collect = hashMap.entrySet().stream()
                .sorted((m1, m2) -> m1.getValue().compareTo(m2.getValue()))
                .collect(Collectors.toMap(
                        (entry) -> entry.getKey(),
                        (entry) -> entry.getValue(),
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println(collect);
    }
}
