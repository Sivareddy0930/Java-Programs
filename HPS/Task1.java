package HPS;

public class Task1 {

   static int findSum(int value){
       int sum=0;



       String s=String.valueOf(value);
       int count=s.length();

       int mod=10;
       int copy=value;


       for (int i=1;i<=count;i++){

           int rem=value%mod;
           sum=sum+rem;
//           System.out.println(sum);
           mod=mod*10;
       }
       for (int i=1;i<=count;i++){
           int rem=copy/10;

           sum=sum+rem;
           copy=copy/10;
//           System.out.println(sum);

       }

       while(value>0){

           int rem=value%10;
//           System.out.println(rem);
           sum=sum+rem;

           value=value/10;
       }



        return sum;

    }
    public static void main(String[] args) {
        System.out.println( findSum(1234));
        System.out.println( findSum(11));
    }
}
