
package tcs_nqt.Arrays;
import java.util.*;

public class Problem1 {
    public static void main(String[] args) {

        int arr1[] = {2,5,1,3,0};
        System.out.println("The smallest:"+sort(arr1)); 
        
    }

    private static int sort(int[] arr1) {
        Arrays.sort(arr1);
        return arr1[0];
    }
}