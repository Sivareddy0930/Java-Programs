public class PrintObjectDirectly {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(a);

        char[] c={'a','b'};
        System.out.println(c);// ab

        boolean[] b={true,false};
        System.out.println(b);

        double[] d={1.2,2.2,3.33,4.4444};
        System.out.println(d);

        String[] ss={"siva","Reddy","Venkata","Tumu"};
        System.out.println(ss);

        String s="Siva";
        System.out.println(s);//Siva

        Object[] o=new Object[10];
        System.out.println(o);

    }
}
