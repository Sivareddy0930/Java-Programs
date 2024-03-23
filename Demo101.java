import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Demo101 {
    private static int findOcc(String s){

        Pattern p=Pattern.compile("abc");
        Matcher m= p.matcher(s);
        int count=0;
        int length=0;
        while (m.find()){
            count++;
//            System.out.println(m.start());
        }
//        System.out.println(count);
        if(count >=2){
            // Reset the Matcher to find again from the beginning
            m.reset();
         while (m.find()){
             String s1=m.group();
//             System.out.println(s1);
             return s1.length();
         }
        }

        return length;
    }

            public static void main(String[] args) {

                String s="abcdabc";
                System.out.println( findOcc(s));
            }

        }


