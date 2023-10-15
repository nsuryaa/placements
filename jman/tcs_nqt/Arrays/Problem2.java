package tcs_nqt.Arrays;

import java.util.* ;
import java.io.*; 

public class Problem2 {

    static int largestElement(int[] arr, int n) {

        Arrays.sort(arr);
        return arr[arr.length-1];

    }
}
