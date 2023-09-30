import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class farthestFromZero1 {

    //Here we need to find the element which is far from 0 considering both +ve and -ve values in an array.

    public static int farthestfromzero(int N, int [] Arr) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        for (int i=0; i<N; i++){
            ts.add(Arr[i]);
        }
        int maxV = ts.last();
        int minV = ts.first();

        if(Math.abs(minV) >= maxV){
            //The Math. abs() returns an absolute value of the number that is a non-negative representation of the number.
            return minV;

        }
        return maxV;

    }

    public static void main(String[] args) {
//        int arr[]={-5,2,3,4,5,6,7,8,9,100};
        int arr[]={-5,2,3,4,5};
        System.out.println(farthestfromzero(5,arr));
    }


}
