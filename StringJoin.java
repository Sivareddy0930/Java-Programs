import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoin {
    public static void m1()
    {
        StringJoiner sj=new StringJoiner("|","[","]");
        sj.add("ok");
        sj.add("fine");
        sj.add("do something");
        sj.add("Bye!");
        System.out.println(sj);
    }


    public static void m2(){
        String arr[]={"I","am","siva","and","I","am","from","AP"};
        //prefix and suffix is not possible to declare.
        String all= String.join(",",arr);
        System.out.println(all);
    }

    public static void m3(){
        String arr[]={"I","am","siva","and","I","am","from","AP"};
       String all= Arrays.stream(arr).collect(Collectors.joining());
        System.out.println(all);
    }
    public static void m4(){
        String arr[]={"I","am","siva","and","I","am","from","AP"};
        String all= Arrays.stream(arr).collect(Collectors.joining("|","[","]"));
        System.out.println(all);
    }


    public static void main(String[] args) {

        //java.util.StringJoiner class, String.join() method and Collectors.joining() method from Java 8. present in java.util.Collectors
        m1();
        m2();
        m3();
        m4();
    }
}
