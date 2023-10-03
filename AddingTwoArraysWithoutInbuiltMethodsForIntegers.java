import java.util.Arrays;

public class AddingTwoArraysWithoutInbuiltMethodsForIntegers {
// my requirement is add two arrays and sort the array Without Inbuilt Methods
    public static void sortArrays(int arr1[],int arr2[]){



        int newArray[]=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            newArray[i]=arr1[i];
        }
        int count=0;

        for(int j=arr1.length;j<arr1.length+arr2.length;j++){

                newArray[j]=arr2[count];
                        count++;

        }
        System.out.println(Arrays.toString(newArray));

        for (int i = 0; i <newArray.length ; i++) {

            int temp;
            for (int j =i+1; j <newArray.length; j++) {
                    if(newArray[i]>newArray[j]){
                        temp=newArray[i];
                        newArray[i]=newArray[j];
                        newArray[j]=temp;
                    }
            }

        }
        System.out.println(Arrays.toString(newArray));



    }
    public static void main(String[] args) {
        int[] a1={2,5,7,9};
        int[] a2={1,6,8};
        sortArrays(a1 ,a2);
    }
}
