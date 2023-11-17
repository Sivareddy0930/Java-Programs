import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,2,2,5,4,4,1,4};
        List<Integer> al= Arrays.asList(arr);

//        Collections.fill(al,0);
        Collections.replaceAll(al,2,8);
        System.out.println(al);
        Collections.swap(al,0,1);
        System.out.println(al);

        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));


    }
}
