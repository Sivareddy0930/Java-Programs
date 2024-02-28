import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordInArray {

    public static void main(String[] args) {
        String s="I know Java programming language ";

        String[] arr = s.trim().split(" ");

       List<String> newList = Arrays.stream(arr).map(value -> new StringBuffer(value).reverse().toString()).collect(Collectors.toList());

       String[] objArr = newList.toArray(new String[0]);
        System.out.println(Arrays.toString(objArr));//[I, wonk, avaJ, gnimmargorp, egaugnal]
    }
}
