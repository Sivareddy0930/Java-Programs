//         1
//        2 2
//       3 3 3
//      4 4 4 4
//     5 5 5 5 5
//    6 6 6 6 6 6


package Patterns.Triangles;

public class NumberTriangular {
    public static void main(String[] args) {

            int a=6;
        for (int i=1;i<=a;i++){
            for (int k = 0; k <=a-i; k++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){

                System.out.print(i+" ");

            }
            System.out.println();
        }

    }
}
