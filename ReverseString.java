public class ReverseString {
    public static void main(String[] args) {
        String s="siva";
            char[] arr=s.toCharArray();  //we can also use charAt()

//        System.out.println(arr);
       // to reverse a string we can do through looping and Using StringBuilder Class
        StringBuilder reverseString=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){

                reverseString.append(arr[i]);
        }
        System.out.println(reverseString);




    }
}
