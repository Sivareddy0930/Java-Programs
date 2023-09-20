import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToggeleEachWordInString {
    public static void main(String[] args) {
        String s="Tumu venkata siva reddy";

        String arr[]=s.trim().split(" ");
        List a=new ArrayList(Arrays.asList(arr));

        Collections.reverse(a);
        System.out.println(a);

        for(int i=0;i<a.size();i++){
            Object k=a.get(i);
//            String kk=String.valueOf(k);
            String kk=k.toString();

            StringBuffer sb=new StringBuffer(kk);
            System.out.print(sb.reverse()+" ");

        }


    }
}
