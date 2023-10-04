public class ReverseNumber {
    public static void main(String[] args) {
        int a=1234;
        int reverse=0;
        for(int i=0;i<4;i++){
            int value;

             value=a%10;
             a=a/10;
            reverse=reverse*10+value;
        }
        System.out.println("Reverse:-"+reverse);

        //-----------------------------------------------------------
        int n=12345678;

        int rev=0;
        while(n>0){
            int value;
            value=n%10;
            n=n/10;
            rev=(rev*10)+value;
        }
        System.out.println(rev);

    }
}
