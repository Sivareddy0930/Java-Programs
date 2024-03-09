import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo4 {
    static int a=0;
   static int b=1;
   static int c=1;
    static void m1(int range){
        if (range>=0){
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
            m1(range-1);
        }
    }
    public static void main(String[] args) {

        int a=0;
        int b=1;
        int c=1;


        for (int i = 0; i <= 10; i++) {
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println();
        m1(10);

    }
}