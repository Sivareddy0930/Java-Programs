import java.util.Scanner;


public class PrimeNumber2 {

    static boolean Prime(int a){
        int count=0;
        for (int i=2;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==1){
            return  true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int Num=sc.nextInt();

        System.out.println(Prime(Num));
    }
}
