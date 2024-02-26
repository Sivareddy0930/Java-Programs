import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AddingTwoArraysStreams {
// my requirement is add two arrays and sort the array Without Inbuilt Methods
    public static void sortArrays(int arr1[],int arr2[]){

        int newArray[]=IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).toArray();


        System.out.println(Arrays.toString(newArray));



    }
    public static void main(String[] args) {
        int[] a1={2,5,7,9};
        int[] a2={1,6,8};
        sortArrays(a1 ,a2);
    }
}
