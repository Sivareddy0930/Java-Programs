import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Demo3 {
    public static void main(String[] args) {

      int a=121;
      int b=a;
      int rev=0;

      while(a>0){
          int z=a%10;
          a=a/10;

          rev=rev*10+z;
      }
        System.out.println(rev);
        System.out.println(a);

        if(rev==b){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }



        }


    }


