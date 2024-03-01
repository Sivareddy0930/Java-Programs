import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSpecialCharactersInString {
    public static void main(String[] args) {
        String s="okay#$% bro1234&*?/";
//find special characters include spaces also.
        Pattern p=Pattern.compile("\\W");
        Matcher m = p.matcher(s);

        while ( m.find()){
           // System.out.print(m.start());

            System.out.print(s.charAt(m.start()));
        }


    }
}
