import java.util.*;

public class Task1 {

    private Long Operation(int arr[]){

        List<Boolean> al=new ArrayList<Boolean>();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if((arr[i] ^ arr[j]) > (arr[i] & arr[j])){
                    al.add(true);
                }
                else {
                    al.add(false);
                }

            }
        }
        Long n=al.stream().filter((bool)->bool==true).count();
        return n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array Elements:- ");
        for (int i = 0; i <arr.length ; i++) {
            int value=sc.nextInt();
            arr[i]=value;
        }
        Task1 obj=new Task1();
        System.out.println(obj.Operation(arr));
    }
}
