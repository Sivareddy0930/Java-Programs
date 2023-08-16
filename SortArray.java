import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={1000,500,4,2,6,8,9999,3,9,1};

//        for (int i = 0; i < arr.length ; i++) {
//            for (int j=i+1;j< arr.length;j++){
//                if(arr[i]>arr[j]){
//
//                    arr[i]=arr[i]+arr[j];
//                    arr[j]=arr[i]-arr[j];
//                    arr[i]=arr[i]-arr[j];
//
//                }
//            }
//
//        }

        Arrays.sort(arr);

        for (int element:arr) {
            System.out.println(element);
        }
    }
}
