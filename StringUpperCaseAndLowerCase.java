public class StringUpperCaseAndLowerCase {
    public static void main(String[] args) {
        //first half must be in lowercase and second half must be uppercase.
        String str="This is Java This is Java";

        int middle=str.length()/2;

        str=str.substring(0,middle).toLowerCase() +str.substring(middle).toUpperCase();
        System.out.println(str);
        System.out.println(" ".toLowerCase()); //this is java THIS IS JAVA
    }
}
