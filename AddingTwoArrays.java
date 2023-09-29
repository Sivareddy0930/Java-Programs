import java.util.*;


public class AddingTwoArrays {
// my requirement is add two arrays and sort the array.
    public static void sortArrays(char arr1[],char arr2[]){

        List<Character> c1=new ArrayList<>();

        for(char c:arr1){
            c1.add(c);
        }
        for(char c:arr1){
            c1.add(c);
        }
        System.out.println(c1);

        Collections.sort(c1);

        System.out.println(c1);

        char charArray[]=new char[c1.size()];
        for (int i = 0; i <c1.size() ; i++) {
            charArray[i]=c1.get(i);
        }

        System.out.println(charArray);


    }
    public static void main(String[] args) {
        char x[]={'a','d','z','s'};
        char y[]={'v','b','x','w'};

        sortArrays(x ,y);
    }
}
