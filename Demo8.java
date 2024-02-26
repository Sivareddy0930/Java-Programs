import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class Demo8 {


    static boolean isPrime(int num) {
        if (num <= 1)
            num= -num;

        if(num==1||num==0) {
            return false;
        }
        int count =0;
        for (int i = 2; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }


        }
        if(count==1) {
            return true;
        }
        else {
            return false;
        }



    }

    // Function to find the smallest prime number in the range
    static int smallestPrimeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
            if (isPrime(i)) {
                System.out.println(i);
                return i;}
        }

        return -1; // If no prime found in the range

    }

    // Function to find the largest prime number in the range
    static int largestPrimeInRange(int start, int end) {
        for (int i = end; i >= start; i--) {
            System.out.println(i);
            if (isPrime(i))
                return i;
        }
        return -1; // If no prime found in the range
    }

    public static void main(String[] args) {
        int start = -97; // Define your range start
        int end = 47; // Define your range end

        int smallestPrime = smallestPrimeInRange(start, end);
        int largestPrime = largestPrimeInRange(start, end);

        if (smallestPrime != -1 && largestPrime != -1) {
            int sum = smallestPrime + largestPrime;
            System.out.println("Sum of smallest and largest prime numbers in the range " + start + " to " + end + " is: " + sum);
        } else {
            System.out.println("No prime numbers found in the range " + start + " to " + end);
        }
    }
    }

