public class Palindrome {
    public static void main(String[] args) {
        String s="abba";

//        char arr[]=new char[s.length()];
//
//        for(int i=0;i<s.length();i++){
//
//            arr[i]=s.charAt(i);
//            System.out.println(arr[i]);
//        }


        // short format for above code is char arr[]=s.toCharArray();

      /*  char arr[]=s.toCharArray();
        System.out.println(arr);

        char[] reverseArray=new char[arr.length];

            int k=0;
        for(int i= arr.length-1;i>=0;i--){
            reverseArray[k]=arr[i];
            k++;
            System.out.println(reverseArray);
        }
        System.out.println(reverseArray);
        String reverseString=new String(reverseArray);
        System.out.println(reverseString);



        if(reverseString.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }   */



        String reverse2="";

        for(int i=s.length()-1;i>=0;i--){
            reverse2=reverse2+s.charAt(i);
        }
        if(reverse2.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
