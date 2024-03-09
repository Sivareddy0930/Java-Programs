import java.util.Arrays;
import java.util.List;

public class FindMissingNumbers {
    public static void main(String[] args) {
        // find missing numbers in array of elements that contains 1 to 10 elements.
        int arr[] = new int[]{1,2,7,9,8,4,10,6};

       Integer[] arr1= Arrays.stream(arr).boxed().toArray(Integer[]::new);

        List al= Arrays.asList(arr1);
        System.out.println(al);
        for (Integer i = 1; i <= 10 ; i++) {
            if (!al.contains(i)){
                System.out.println(i);
            }
        }
    }
}
