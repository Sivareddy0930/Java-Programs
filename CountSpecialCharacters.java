public class CountSpecialCharacters {
    public static void main(String[] args) {
        //count special characters except alpha,numeric and space
        String s="okay#$% bro<~1234&*?/{([*&";
        int count=0;
        for (int i = 0; i < s.length() ; i++) {
            if ( !Character.isDigit(s.charAt(i) ) && !Character.isAlphabetic(s.charAt(i))  && !Character.isWhitespace(s.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
