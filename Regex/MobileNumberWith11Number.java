package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberWith11Number {
    public static void main(String[] args) {
        //given number is valid mobile number or not .

        String s="09866123628";

        Pattern p=Pattern.compile("0?[7-9][0-9]{9}");
        Matcher p1= p.matcher(s);
        System.out.println(p1.matches());



    }
}
