package tcs_nqt.Arrays;

import java.util.Arrays;

public class Problem10
{
    public static void main(String[] args) {
        int[] arr = {4,7,1,2,5,6};
        int n = 6;
        getMedian(arr,n);
    }

    private static void getMedian(int[] arr, int n) {

        Arrays.sort(arr);
        if(n % 2 == 0)
        {
            int ind1 = (n/2) - 1;
            int ind2 = (n/2);
            System.out.println((double)(arr[ind1]+arr[ind2])/2);
        }
        else
        {
            System.out.println(arr[(n/2)]);
        }
    }

}