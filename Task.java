//import java.util.Arrays;
//
//public class Task {
//
//
//        public static void main(String[] args) {
//            int[] arr1={2,2,2,2};
//            int[] arr2={5,5,5,5};
//          boolean b=false;
//            for (int i = 0; i <2 ; i++) {
//                for (int j = 0; j <arr1.length ; j++) {
//                    for (int k = j+1; k <arr1.length;  k++) {
//                        if(arr1[i]==arr1[j]){
//                            b=true;
//                        }
//                        else{
//                            b=false;
//                        }
//                    }
//                }
//            }
//
//
//                if (b){
//                    System.out.println(arr1.length);
//                }
//                else{
//
//
//                    int times=(int)Math.ceil(arr1.length/2.0);
//                    int count=0;
//
//                    for (int i = 0; i < times ; i++) {
//
//                        count++;
//
//
//                    }
//                    System.out.println(count);
//                }
//            }
//
//        }
//
//
import java.util.Scanner;

public class Task {
    static int a=0;
    static int b=1;
      static int res=0;

    public static void m1(int value){

        if(value==0){
            return ;
        }


        res=a+b;
        System.out.println(res);
        a=b;
        b=res;
        m1(value-1);

    }
    public static void main(String[] args) {
        int i=10;

        int a=0;
        int b=1;

        System.out.println("0");
        System.out.println("1");
//        int res=0;
//        while(i-2>0){
//            res=a+b;
//            System.out.println(res);
//            a=b;
//            b=res;
//            i--;
//        }

        m1(i);

    }
}
