public class PerfectSquare {
    public static void main(String[] args) {
        //Check 5 random numbers is perfect square or not

        for (int i = 1; i <= 5; i++) {
            int randvalue=(int)Math.floor(Math.random()*100);
            System.out.println(randvalue + " is perfect Square:-");
            double d=Math.sqrt(randvalue);
            if (d - Math.floor(d)==0){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
    }
}
