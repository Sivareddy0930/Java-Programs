package Tests;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Map<String,Integer> hashMap =new HashMap<>();
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);
        hashMap.put("five",5);
        hashMap.put("four",4);

        // Sorting by values
//        Map<String, Integer> sortedByValues = hashMap.entrySet()
//               .stream()
//               .sorted(Map.Entry.<String, Integer>comparingByValue())
//               .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (e1, e2) -> e1,
//                        LinkedHashMap::new
//                ));
//
//        System.out.println("Sorted by values: " + sortedByValues);
//
//        // Sorting by keys
//        Map<String, Integer> sortedByKey = hashMap.entrySet()
//               .stream()
//               .sorted(Map.Entry.<String, Integer>comparingByKey())
//               .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (e1, e2) -> e1,
//                        LinkedHashMap::new
//                ));
//
//        System.out.println("Sorted by keys: " + sortedByKey);

        // Sorting by values

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        ArrayList<Map.Entry<String, Integer>> entriesList = new ArrayList<>(entries);

        Collections.sort(entriesList, new Comparator<Map.Entry<String,Integer>>(){

            public int compare(Map.Entry<String,Integer> e1 , Map.Entry<String,Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        });

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<String,Integer>();
        for(Map.Entry<String,Integer> entry:entriesList){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println(linkedHashMap);
    }
}
