package tcs_nqt.Arrays;

import java.util.*;
public class Problem6
{
    public static void main(String[] args) {
        int arr[] = {8,7,1,6,5,9};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++)
        {
            System.out.print(arr[i] + " ");
        }
        for(int i=n-1;i>=n/2;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }

}