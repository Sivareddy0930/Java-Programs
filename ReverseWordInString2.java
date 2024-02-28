import java.util.*;
import java.util.stream.Collectors;

public class ReverseWordInString2 {
    public static void main(String[] args) {
       String arr[]={"i","Am","siva","Reddy"};
//      String[] newArr = Arrays.stream(arr).collect(Collectors.collectingAndThen(Collectors.toList(),list -> {
//           Collections.reverse(list);
//           return list.toArray(new String[0]);
//       }));

        String[] newArr = Arrays.stream(arr).collect(Collectors.collectingAndThen(Collectors.toList(),list -> {
            Collections.reverse(list);
            return list.toArray(new String[0]);
        }));
        System.out.println(Arrays.toString(newArr));


    }
}
