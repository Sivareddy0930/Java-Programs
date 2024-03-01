public class RemoveSpecialCharactersFromString {
    public static void main(String[] args) {
        String s="okay#$% bro1234&*?/";
        String onlyString="";
        int SpecialCharCount=0;
        for (int i = 0; i < s.length() ; i++) {
            if ( !Character.isDigit(s.charAt(i) ) && !Character.isAlphabetic(s.charAt(i))  && s.charAt(i)!=' '){
                SpecialCharCount++;
            }
            else {
                onlyString=onlyString+String.valueOf(s.charAt(i));
            }
        }
        System.out.println(onlyString);
    }
}
