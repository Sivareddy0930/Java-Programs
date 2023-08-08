public class SumOfSelectedNumbers {

    public static void main(String[] args) {
        int a=12345;
        //sum of first and second last number.
        int[] arr=new int[5];
       for (int i=arr.length-1;i>=0;i--){
           if(a!=0){

               int temp=a%10;
                arr[i]=temp;
               a=a/10;


           }
       }
        //testing purpose
        for (int obj:arr) {
            System.out.println(obj);
        }
        //Task:-sum of first and second last number.
        int sum=0;
        for(int j=0;j<arr.length;j++){
            if(j==0 || j== arr.length-2){

                sum=sum+arr[j];

            }
        }
        System.out.println("sum of first and second last number :-"+sum);//5

    }
}
