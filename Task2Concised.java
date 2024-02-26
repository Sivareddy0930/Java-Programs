import java.util.Scanner;

public class Task2Concised {

    static String reversed;
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

                String original=String.valueOf(Value);
                 reversed=new StringBuffer(original).reverse().toString();

                return original.equals(reversed);

    }

    private static void palindromeAndPrime(int value){
        if (primeOrNot(value)){
            if (palindromeOrNot(value)){
                System.out.println("it is prime and palindrome");
            }
            else {
                if (primeOrNot(Integer.parseInt(reversed))){
                    System.out.println("it is prime and palindrome and also prime when actual value is reversed");
                }
                else {
                    System.out.println("it is prime and palindrome but it is not a prime when actual value is reversed");
                }
            }
        }
        else {
            System.out.println("it is not a prime");

        }
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:-");
        int value=sc.nextInt();

       palindromeAndPrime(value);

    }
}
