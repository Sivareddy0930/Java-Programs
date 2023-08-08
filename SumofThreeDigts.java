public class SumofThreeDigts {
    public static void main(String[] args) {
        int a=442;
        int sum=0;

        for(int i=0;i<3;i++){
            int value=0;
            value=a%10;
            sum=sum+value;

            a=a/10;
        }

        System.out.println(sum);
    }
}
