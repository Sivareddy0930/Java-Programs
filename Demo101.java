import java.util.function.Predicate;

class Main{
          public static void main(String[] args) {
              System.out.println(test1(i -> i == 2));
         }
         private static boolean test1(Predicate<Integer> p) {
          return p.test(2);
         }
}
     