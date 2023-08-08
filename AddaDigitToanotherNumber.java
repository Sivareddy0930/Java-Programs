//Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
//        For example, if the number which was taken is 5696, then the displayed number should be 7918.
public class AddaDigitToanotherNumber {
    public static void main(String[] args) {
        int num=5696;
        int oncePlace=num%10;//6
        int TensPlace=(num/10)%10;//9
        int HundredPlace=(num/100)%10;//6
        int thousendsPlace=(num/1000);//5

//        System.out.println(oncePlace);
//        System.out.println(TensPlace);
//        System.out.println(HundredPlace);
//        System.out.println(thousendsPlace);

        oncePlace=oncePlace+2;
        TensPlace=TensPlace+2;
        HundredPlace=HundredPlace+2;
        thousendsPlace=thousendsPlace+2;

        int Result=thousendsPlace*1000+HundredPlace*100+TensPlace*10+oncePlace;
        System.out.println(Result);
    }
}
