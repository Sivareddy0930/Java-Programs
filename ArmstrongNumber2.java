public class ArmstrongNumber2 {
    public static void main(String[] args) {
        int a=1634;
        int b=a;
        int c=a;
        int rem;
        int sum=0;
        int count=0;
        while (b>0){
            count++;
            b=b/10;
        }

        while (a>0){
            rem=a%10;
            int pow=1;
            for (int i = 0; i < count ; i++) {

                pow=pow*rem;

            }
            sum=sum+pow;
            a=a/10;

        }
        if (c==sum){
            System.out.println("Anagram");
        }
        else {
            System.out.println("not Anagram");
        }

    }
}
