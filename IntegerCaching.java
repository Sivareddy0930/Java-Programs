public class IntegerCaching {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        Integer c = 500;
        Integer d = 500;


        if (a == b) {
            System.out.println("ok");
        } else {
            System.out.println("not okay");
        }

        if (c == d) {
            System.out.println("ok");
        } else {
            System.out.println("not okay");
        }

        if (a.equals(b)) {
            System.out.println("ok 1");
        } else {
            System.out.println("not okay");
        }

        if (c.equals(d)) {
            System.out.println("ok 1");
        } else {
            System.out.println("not okay");
        }

    }
}
