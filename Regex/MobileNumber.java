package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
    public static void main(String[] args) {
        //given number is valid mobile number or not .

        String s="9866123628";

        Pattern p=Pattern.compile("[7-9][0-9]{9}");
        Matcher p1= p.matcher(s);
        System.out.println(p1.matches());



    }
}
