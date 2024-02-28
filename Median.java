public class Median {
    static void m1(int arr[]){
        double median=0;
        if(arr.length%2 ==0){
            median = (arr[arr.length/2 -1]+arr[arr.length/2 ] ) /2.0;
        }
        else{
            median = arr[arr.length/2 ];
        }
        System.out.println(median);
    }

    public static void main(String[] args) {
        m1(new int[]{1,2,3,4,5,6,7,8});


    }
}
