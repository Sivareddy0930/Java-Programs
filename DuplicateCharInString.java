public class DuplicateCharInString {
    public static void main(String[] args) {
        String s="Java programming";
        StringBuilder sb =new StringBuilder();
        s.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println(sb);

        //approach 2

        StringBuilder sb1 =new StringBuilder();
        for (int i=0;i<s.length();i++){
            Character c = s.charAt(i);
           int indexPosition =  s.indexOf(c,i+1);
           if(indexPosition == -1){
               sb1.append(c);
           }
        }
        System.out.println(sb1);
    }
}
