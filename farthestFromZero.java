import java.util.*;

public class farthestFromZero {
//    int a[]=new int[5];
public static void main(String[] args) {
    int a[]= {-5,2,5,1,4,100,-100};
    List<Integer> l=new ArrayList<Integer>();
    for(int aa:a){
        l.add(aa);
    }
    Collections.sort(l);
    Integer k=l.get(0);
    Integer m=l.get(l.size()-1);
//    System.out.println(k+""+m);



    if(k>=0){
       if(k>=m){
           System.out.println(k);
       }
       else{
           System.out.println(m);
       }
    }
    else{
        if(-(k)>=m){
            System.out.println(k);
        }
        else{
            System.out.println(m);
        }

    }



}



}
