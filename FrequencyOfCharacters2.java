import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyOfCharacters2 {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,2,2,5,4,4,1,4};

        Map<Integer,Long> mapObj=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapObj);


    }
}
