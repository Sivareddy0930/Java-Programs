import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        // only divided by 1 and itself.
        // 0 and 1 are not a prime numbers.

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int Num=sc.nextInt();

//        if(Num ==0 || Num==1){
//            System.out.println("Not a Prime Number");
//        }

        int count=0;
        for(int i=2;i<=Num;i++){

            if(Num%i==0){
                count++;
            }
        }

        if(count==1){

            System.out.println(Num+" is a prime Number");
        }
        else {
            System.out.println(Num+" is not a prime Number");
        }
    }
}
