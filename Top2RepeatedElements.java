import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Top2RepeatedElements {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "orange", "banana", "apple", "orange", "apple");

        Map<String,Long> map=words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        List<Map.Entry<String,Long> > mapTopTwo = map.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).limit(2).collect(Collectors.toList());


        for (Map.Entry<String,Long> entry:mapTopTwo) {
            System.out.println(entry.getKey());
        }

    }
}