import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordInString {
    public static void main(String[] args) {
        String s="Tumu venkata siva reddy";

        String arr[]=s.trim().split(" ");
        List a=new ArrayList(Arrays.asList(arr));

        Collections.reverse(a);
        System.out.println(a);

        for(int i=0;i<a.size();i++){

            System.out.print(a.get(i)+" ");//reddy siva venkata Tumu

        }
        System.out.println();

        for(Object ss:a){
            System.out.print(ss +" ");//reddy siva venkata Tumu
        }

    }
}
