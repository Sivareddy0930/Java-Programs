public class FindOddNumbers {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,12,15,16,17,19};
        // Find the odd numbers in an given array.

        int i=0;
        while (i<arr.length){
            if(arr[i]%2 !=0){
                System.out.println(arr[i]);
            }
            i++;
        }


    }
}
