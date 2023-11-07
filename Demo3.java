import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Demo3 {
    public static void main(String[] args) {

      String s= "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss";

      char[] ch=s.toCharArray();
        System.out.println(ch);

        

       long count=Stream.of(ch).count();
        System.out.println(count);

        }


    }


