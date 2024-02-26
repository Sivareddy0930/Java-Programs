import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Demo {
    public static int sum(int n) {
        if (n <= 0) {
            return sum(n + 1);
        }
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sum(-5));
    }
}