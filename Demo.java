//char x[]={'a','d','z','s'};
//char y[]={'v','b','x','w'};

import java.util.*;

public class Demo {

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
           // Collections.sort(al);
        System.out.println(al);

        String arr[]=new String[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
