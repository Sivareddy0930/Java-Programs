import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();
        map.put("1",10);
        map.put("5",50);
        map.put("2",20);
        map.put("3",30);
        map.put("4",40);
        List<Map.Entry<String,Integer>> enterysets = new ArrayList(map.entrySet());
        Collections.sort(enterysets, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {

                return o1.getValue().compareTo((o2.getValue()));
            }
        });

        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();

        for (Map.Entry<String,Integer> mapValues:enterysets){
            linkedHashMap.put(mapValues.getKey(),mapValues.getValue());
        }

        System.out.println(linkedHashMap);
        
    }
}
