import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class FrequencyOfCharacters {
    public static void main(String[] args) {

        Integer arr[]={1,2,3,4,2,2,5,4,4,1,4};
        List<Integer> al=Arrays.asList(arr);

        System.out.println(al);

        Set<Integer> s=new HashSet<>(al);

        for (Integer i:s) {
            System.out.println("frequency of"+i+"="+Collections.frequency(al,i));
        }


    }
}
