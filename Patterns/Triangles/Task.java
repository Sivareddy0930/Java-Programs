package Patterns.Triangles;

public class Task {
    public static void main(String[] args) {
        for(int i=7;i>0;i--){
            if(i==6||i==4){
                continue;
            }
            else {
                for (int j = i; j >0 ; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
