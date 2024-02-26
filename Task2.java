import java.util.Scanner;

public class Task2 {

    private static boolean primeOrNot(int v) {
        int count = 0;
        if (v == 0 || v == 1) {
            return false;
        } else {
            for (int i = 2; i <= v; i++) {
                if (v % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                return true;
            } else {
                return false;
            }
        }
    }
    private static Boolean palindromeOrNot(int Value){

            if (primeOrNot(Value)){
                String original=String.valueOf(Value);
//                StringBuffer sb=new StringBuffer(x);
//                StringBuffer rev=sb.reverse();
//                String reversed=new String(rev);

                String reversed=new StringBuffer(original).reverse().toString();

                if (original.equals(reversed)){
                    System.out.println("prime but it is palindrome");
                    return false;
                }
                else{
                    int reversedValue=Integer.parseInt(reversed);
                    if(primeOrNot(reversedValue)){
                        System.out.println("it is prime before reverse and it is not a palindrome when it is reversed and checked with actual value.and also it prime when it is reversed");
                        return true;
                    }else{
                        System.out.println("it is prime before reverse and it is not a palindrome when it is reversed and checked with actual value.But it is not a prime when it is reversed");
                        return false;

                    }
                }
            }
            else {
                System.out.println("not a prime number");
                return false;
            }

    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:-");
        int value=sc.nextInt();

        System.out.println(palindromeOrNot(value));

    }
}
