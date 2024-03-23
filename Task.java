//import java.util.Arrays;
//
//public class Task {
//
//
//        public static void main(String[] args) {
//            int[] arr1={2,2,2,2};
//            int[] arr2={5,5,5,5};
//          boolean b=false;
//            for (int i = 0; i <2 ; i++) {
//                for (int j = 0; j <arr1.length ; j++) {
//                    for (int k = j+1; k <arr1.length;  k++) {
//                        if(arr1[i]==arr1[j]){
//                            b=true;
//                        }
//                        else{
//                            b=false;
//                        }
//                    }
//                }
//            }
//
//
//                if (b){
//                    System.out.println(arr1.length);
//                }
//                else{
//
//
//                    int times=(int)Math.ceil(arr1.length/2.0);
//                    int count=0;
//
//                    for (int i = 0; i < times ; i++) {
//
//                        count++;
//
//
//                    }
//                    System.out.println(count);
//                }
//            }
//
//        }
//
//
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for arr1
        System.out.print("len arr1: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of arr1:");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

//         Taking input for arr2 (not used in this version of code)
         System.out.print("len arr2: ");
         n = scanner.nextInt();
         int[] arr2 = new int[n];
         System.out.println("Enter the elements of arr2:");
         for (int i = 0; i < n; i++) {
             arr2[i] = scanner.nextInt();
         }

        boolean b = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = j + 1; k < arr1.length; k++) {
                    if (arr1[i] == arr1[j]) {
                        b = true;
                    } else {
                        b = false;
                    }
                }
            }
        }
        if (b) {
            System.out.println( arr1.length);
        } else {
            int times = (int) Math.ceil(arr1.length / 2.0);

            System.out.println("Count: " + times);
        }
    }
}
