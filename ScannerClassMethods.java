import java.util.Scanner;

public class ScannerClassMethods {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);

        int i=sc.nextInt();

        short sh=sc.nextShort();

        float fl=sc.nextFloat();

        double d=sc.nextDouble();

        String s=sc.next();

        String sl=sc2.nextLine();

        char c=sc2.next().charAt(0);

        boolean b=sc2.nextBoolean();


        System.out.println(i);
        System.out.println(sh);
        System.out.println(fl);
        System.out.println(d);
        System.out.println(s);
        System.out.println(sl);
        System.out.println(c);
        System.out.println(b);

    }

}
