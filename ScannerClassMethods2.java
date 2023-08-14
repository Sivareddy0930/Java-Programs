import java.util.Scanner;

public class ScannerClassMethods2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner("true 1 2.4 siva true");

//        while(sc.hasNext()){
//            if(sc.hasNextBoolean()){
//                System.out.println("boolean type");
//            }
//            else {
//                System.out.println("not boolean type");
//            }
//You are only checking for whether the next token is a boolean using hasNextBoolean(), but you also need to consume the token using next() after identifying its type. This is because if the current token is not a boolean, it will be left unconsumed, and the loop will get stuck in an infinite loop.

        while (sc.hasNext()) {
            if (sc.hasNextBoolean()) {
                System.out.println("boolean type: " + sc.nextBoolean());
            } else if (sc.hasNextInt()) {
                System.out.println("int type: " + sc.nextInt());
            } else if (sc.hasNextDouble()) {
                System.out.println("double type: " + sc.nextDouble());
            } else {
                System.out.println("string type: " + sc.next());
            }
        }

    }
}
