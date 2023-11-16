import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class FindDuplicates {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,55,1,3,28,9,8,};

        Set<Integer> encountered = new HashSet<>();

        Predicate<Integer> isDuplicate = n -> !encountered.add(n);


        List al=new ArrayList();

        for(Integer a:arr) {

            if(isDuplicate.test(a)){
                al.add(a);
            }

        }
        System.out.println(al);

    }
}
