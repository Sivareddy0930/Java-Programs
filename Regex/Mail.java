package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
//       Matcher m= p.matcher("$sivareddy0930@gmail.com");//false
//        Matcher m= p.matcher("sivareddy0930@gmail.com");//true
        Matcher m= p.matcher("$sivareddy0930@gmail.com9");//false



           System.out.println(m.matches());

    }
}
