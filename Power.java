
import java.lang.Math;
public class Power {

    static void power(double a, double b){
        double pow=Math.pow(a,b);
        System.out.println(pow);

    }

    static void power2(double c, double d){
        double pow=1;
       for(int i=1;i<=d;i++){
           pow=pow*c;
       }
        System.out.println(pow);
    }

    public static void main(String[] args) {
        power(2,2);
        power2(7,5);
    }
}
