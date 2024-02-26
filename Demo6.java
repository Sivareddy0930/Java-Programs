public class Demo6 {


        public static void main(String[] args) {
//            int[] arr = {2, 3, 1, 6, 3};
//            int d = 4;
            int[] arr = {3, 3, 4, 7, 8};
            int d = 5;
            int result = getTripletCount(arr, d);
            System.out.println(result);
        }

        static int getTripletCount(int[] arr, int d) {
            int n = arr.length;
            int count = 0;

            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if ((arr[i] + arr[j] + arr[k]) % d == 0) {
                            count++;
                        }
                    }
                }
            }

            return count;
        }
    }



