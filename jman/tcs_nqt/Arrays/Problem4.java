package tcs_nqt.Arrays;

import java.util.Arrays;
// import java.util.Collection;
import java.util.Collections;

public class Problem4 {

    public static void main(String[] args) {
        int n=5;
        Integer arr[] = {5,4,3,2,1};
        reverseArray(arr);
        printArray(arr,n);
    }

    private static void printArray(Integer[] arr, int n) {
        System.out.println("Reversed array:\n");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverseArray(Integer[] arr) {
        Collections.reverse(Arrays.asList(arr));
    }
    
    
}
