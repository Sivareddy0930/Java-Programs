import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(1,2,3,4,5,6,7,8);

        Integer[] arr= al.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(arr));
        int temp=0;
        for (int i = 0; i < arr.length /2 ; i++) {
            temp=arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1 -i]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
