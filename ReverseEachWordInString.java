import com.sun.jdi.Value;

import java.util.*;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        //OUTPUT:-tUMU vENKATA sIVA rEDDY

        String s="Tumu venkata siva reddy";
            s=s.toUpperCase();


        String arr[]=s.trim().split(" ");



        for(String o:arr){
            char c=o.charAt(0);
            String oo=String.valueOf(c);
            oo=oo.toLowerCase();

            StringBuffer sb=new StringBuffer(o);

            sb.replace(0,1,oo);
            String ss=new String(sb);
            System.out.print(ss+" ");
        }
//=============================================================
        System.out.println();
        List newList=new ArrayList();
        for (String value:arr) {
            char c=value.charAt(0);
           String charString = String.valueOf(c);
           charString = charString.toLowerCase();
          String finalValue =  new StringBuffer(value).replace(0,1,charString).toString();
          newList.add(finalValue);
        }
        System.out.println(String.join(" ",newList));


    }
}
