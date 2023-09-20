public class ReverseString {
    public static void main(String[] args) {
        String s="siva";
            char[] arr=s.toCharArray();
        StringBuilder reverseString=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){

                reverseString.append(arr[i]);
        }
        System.out.println(reverseString);
//------------------------------------------------------------------------------------
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String s1=new String(sb);
        System.out.println(s1);





    }
}
