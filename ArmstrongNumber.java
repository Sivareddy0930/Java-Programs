public class ArmstrongNumber {
    public static void main(String[] args) {
        int a=1634;
        int b=a;
        int c=a;

        int count=0;
        int rem;
        int sum=0;
        while(b>0){
            count++;
            b=b/10;
        }

        while(c>0){
            rem=c%10;
            int pow=1;
            for (int i = 0; i <count ; i++) {
                pow=pow*rem;
            }

            c=c/10;

            sum=sum+pow;


        }

        if(sum==a){
            System.out.println(a+" is Armstrong Number");
        }
        else {
            System.out.println(a+" is Not an Armstrong Number");
        }

    }
}
