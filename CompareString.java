import java.util.Arrays;
import  java.util.List;
import java.util.*;
public class CompareString {
     String s="abcd";
     String s1="abcd";

    void m1(){
        String[] st = s.split("");

        System.out.println(st.getClass());
        List<String> l = Arrays.asList(st);
        Collections.shuffle(l);
        System.out.println(l);
        String[] st1 = l.toArray(new String[0]);
        String f=new String();
                for(String a:st1){
                    f=f+a;

                }
        System.out.println(f);


        System.out.println(s1+":"+f);

        if (s1.equals(f)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        CompareString cs=new CompareString();
        cs.m1();
    }

}
