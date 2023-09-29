public class PrimeNumber3 {



        static private int a;

        private static boolean b;




        public static int getA() {
            System.out.println(m1(a));
            return a;
        }




        public static void setA(int a) {
            PrimeNumber3.a = a;
        }




        public static boolean isB() {
            return b;
        }




        public static void setB(boolean b) {
            PrimeNumber3.b = b;
        }


        static boolean m1(int a) {
            int count=0;
            //System.out.println("called");
            for(int i=2;i<=a;i++) {
                if(a%i==0) {
                    count++;
                }
            }

            boolean b=count==1? true :false;
            return b;

        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            setA(4);
            setB(false);
            getA();
    }

}
