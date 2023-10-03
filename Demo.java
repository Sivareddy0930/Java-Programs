

import java.util.*;

class Demo {
    public static int[] merge(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[] m = new int[l1 + l2];

        int i = 0, j = 0, k = 0;

        while (i < l1 && j < l2) {
            if (arr1[i] < arr2[j]) {
                m[k++] = arr1[i++];
            } else {
                m[k++] = arr2[j++];
            }
        }

        while (i < l1) {
            m[k++] = arr1[i++];
        }

        while (j < l2) {
            m[k++] = arr2[j++];
        }

        return m;
    }

    public static void main(String[] args) {
        int[] a1={2,5,7,9};
        int[] a2={1,6,8,2,3,4};
        int[] b=merge(a1,a2);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}