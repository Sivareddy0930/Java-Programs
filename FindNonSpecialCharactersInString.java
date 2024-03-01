import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNonSpecialCharactersInString {
    public static void main(String[] args) {
        String s="okay#$% bro1234&*?/";
//find Non-special characters.
//        Pattern p=Pattern.compile("[a-zA-Z0-9]");
        Pattern p=Pattern.compile("\\w");//     \w represent any alpha numeric character
        Matcher m = p.matcher(s);

        while ( m.find()){
           // System.out.print(m.start());

            System.out.print(s.charAt(m.start()));
        }


    }
}
