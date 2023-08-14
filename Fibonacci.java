public class Fibonacci {
    public static void main(String[] args) {
        //Fibonacci is number that is the  sum of previous two numbers .
        //print first 10 Fibonacci series numbers.

        //model:-1

//        int a=0;
//        int b=1;
//        System.out.print(a+","+b);
//        int c;
//        for(int i=0;i<8;i++){
//
//            c=a+b;
//            System.out.print(","+c);
//           a=b;
//           b=c;
//
//        }

        //model:-2

//        int a=0;
//        int b=1;
//        int c=1;
//
//        for(int i=0;i<10;i++){
//            System.out.print(a+",");
//            a=b;
//            b=c;
//            c=a+b;
//        }

        m1(10);

    }

    //model:-3
    //Using recursion

    static int a=0;
    static int b=1;
    static int c=1;


    public static void m1(int count){
       if(count>0){
           System.out.print(a+",");
           a=b;
           b=c;
           c=a+b;
           m1(count-1);

       }
    }
}
