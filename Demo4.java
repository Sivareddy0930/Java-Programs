
public class Demo4 {
    public static void main(String[] args) {
        int[] arr1={9,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        int count=0;
        if (arr1.length==arr2.length){
            for (int i = 0; i < arr1.length ; i++) {
                if(arr1[i]==arr2[i]){
                    count++;
                }
            }
            if (count==arr1.length){
                for (int i = 0; i < arr1.length; i++) {
                    System.out.println("Machine "+(i+1) +":"+arr1[i]+","+arr2[i]);
                }
            }
            else{

                int index=0;
                int x=1;
                int times=(int)Math.ceil(arr1.length/2.0);
                System.out.println(times);
                for (int i = 0; i < times ; i++) {
                   if(index< arr1.length){
                       System.out.print("Machine "+(x) +":"+arr1[index]+","+arr2[index]);
                   }
                   if(index+1 < arr1.length){
                       System.out.print(","+arr1[index+1]+","+arr2[index+1]);
                   }
                    index=index+2;
                    x++;
                    System.out.println();
                }
            }
        }

    }
}