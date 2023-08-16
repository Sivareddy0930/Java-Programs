//        1 2 3 4 5 6
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1


package Patterns.Pyramids;
import java.util.Scanner;
public class NumberDescPyramid {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Value:- ");
        int value =sc.nextInt();// value =6

        for (int i=value;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
