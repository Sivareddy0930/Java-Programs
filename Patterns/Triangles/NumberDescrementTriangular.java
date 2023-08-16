package Patterns.Triangles;

public class NumberDescrementTriangular {
    public static void main(String[] args) {
        int rows=4;
            int num=1;
        for (int i =rows; i>=1 ; i--) {
            for (int k = 1; k <=rows-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {

                System.out.print(num+" ");
                num++;
            }
            System.out.println();

        }
    }
}
