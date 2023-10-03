class Demo1 {
    public static void merge(int[] arr1, int[] arr2) {
        int arr[]=new int[arr1.length+arr2.length];

        for (int i = 0; i <arr1.length; i++) {
            arr[i]=arr1[i];
        }
        int count=0;
        for (int j =arr1.length; j <arr1.length+arr2.length ; j++) {
            arr[j]=arr2[count];
            count++;
        }

        for (int k = 0; k <arr.length; k++) {
            for (int l =k+1; l <arr.length ; l++) {
                if(arr[k]>arr[l]){
                    arr[l]=arr[k]+arr[l];
                    arr[k]=arr[l]-arr[k];
                    arr[l]=arr[l]-arr[k];
                }
            }
        }

        for (int a:arr){
            System.out.println(a);
        }


    }

    public static void main(String[] args) {
        int[] a1={2,5,7,9};
        int[] a2={1,6,8,2,9,3,4};
        merge(a1,a2);

    }
}