public class StringFormat {
    public static void main(String[] args) {
        int num = 7044;
        String s="siva";

        // Output is 3 zero's("000") + "7044",
        // in total 7 digits
        String str = String.format("%07d", num);
        String str1 = String.format("%15s"+"%07d",s, num);

        // Print and display the formatted string
        System.out.println(str);
        System.out.println(str1);
    }
}
