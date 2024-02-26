import java.util.Arrays;

public class Anagram {
//    Two strings are called anagrams if they contain same set of characters but in different order.

    private static void isAnagram(String s1 , String s2){
        s1=s1.replaceAll(" ","");
        s2=s2.replaceAll(" ","");

        char[] array1 = s1.toLowerCase().toCharArray();
        char[] array2 = s2.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        boolean status=Arrays.equals(array1,array2);

        if (status) {
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not Anagrams");
        }

    }
    public static void main(String[] args) {

        isAnagram("Keep", "Peek");
        isAnagram("Mother In Law", "Hitler Woman");
    }
}
