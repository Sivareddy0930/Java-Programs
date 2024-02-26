public class Prime {
    static void primeNumbers(){
        for (int i = 50; i <=150 ; i++) {
            int count=0;
            for (int j =2; j <=i ; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if (count==1){
                System.out.println("prime:-"+i);
            }
        }
    }
    public static void main(String[] args) {
        primeNumbers();
    }
}
