import java.util.ArrayList;
import java.util.Arrays;

public class SortStringArray {
    public static void main(String[] args) {
        String x[]={"Siva","Reddy"};
        String y[]={"Tumu","Venkata"};
        addArrays(x,y);
    }




    public static void addArrays(String c[], String c1[]){
        ArrayList<String> al=new ArrayList();

        for(String ch:c){

            al.add(ch);
        }
        for(String ch:c1) {

            al.add(ch);
        }

        System.out.println(al);

        String arr[]=new String[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
