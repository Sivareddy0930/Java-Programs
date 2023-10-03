import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AddingTwoArraysWithoutInbuiltMethods {
// my requirement is add two arrays and sort the array Without Inbuilt Methods
    public static void sortArrays(char arr1[],char arr2[]){



        char newArray[]=new char[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            newArray[i]=arr1[i];
        }
        int count=0;

        for(int j=arr1.length;j<arr1.length+arr2.length;j++){

                newArray[j]=arr2[count];
                        count++;

        }
        System.out.println(newArray);

        for (int i = 0; i <newArray.length ; i++) {

            char temp;
            for (int j =i+1; j <newArray.length; j++) {
                    if(newArray[i]>newArray[j]){
                        temp=newArray[i];
                        newArray[i]=newArray[j];
                        newArray[j]=temp;
                    }
            }

        }
        System.out.println(newArray);


    }
    public static void main(String[] args) {
        char x[]={'a','d','z','s'};
        char y[]={'v','b','x','w'};

        sortArrays(x ,y);
    }
}
