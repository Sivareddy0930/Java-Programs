import java.util.Scanner;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:- ");

        String s=sc.next();

        char[] arr=s.toCharArray();

        for(int i=0;i<arr.length;i++){

                int count=1;
            for (int j = i+1; j < arr.length ; j++) {
                    //Not complited.
                    if(arr[i]==arr[j]){
                        count++;
                    }

            }

            System.out.println(arr[i]+"="+count);
        }


    }
}
