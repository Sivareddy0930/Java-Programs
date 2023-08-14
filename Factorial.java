import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:-");
        int Factorial=sc.nextInt();
        int result=1;
        for(int i=1;i<=Factorial;i++){
            result=result*i;
        }
        System.out.println("Factorial of "+Factorial+"= "+result);


    }
}
