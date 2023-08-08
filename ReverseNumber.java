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
    }
}
