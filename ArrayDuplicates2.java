public class ArrayDuplicates2 {
    public static void main(String[] args) {
        int arr[] ={1,2,6,7,9,2,4,9,7,9,2};

        boolean[] dups= new boolean[arr.length];
        for (int i = 0; i < arr.length ; i++) {
                if (!dups[i]){

                    for (int j = i+1; j < arr.length ; j++) {
                        if (arr[i]==arr[j]){
                            System.out.println(arr[i]);
                            dups[i]=true;
                            break;
                        }
                    }

                }

        }
    }
}
