import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
//        For example, if the number which was taken is 5696, then the displayed number should be 7918.
public class AddaDigitToanotherNumber2 {
    public static void main(String[] args) {
        int num=5696;


        int ones=num%10 +2;
        int tens=(num/10)%10 +2;
        int hun=(num/100)%10 +2;
        int thu=(num/1000) +2;
        System.out.println(thu*1000+hun*100+tens*10+ones);
    }
}
