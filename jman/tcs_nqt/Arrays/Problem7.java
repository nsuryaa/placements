package tcs_nqt.Arrays;

import java.util.*;
import java.util.stream.IntStream;

// public class Problem7
// {
//     public static void main(String[] args) {
//         int n=5;
//         int arr[] = {1,2,3,4,5};
//         int sum = 0;
//         for(int i=0;i<n;i++)
//         {
//             sum+=arr[i];
//         }
//         System.out.println("The sum of the elements of the arrays is: " + sum);
//     }
// }
import java.util.*;
import java.util.stream.IntStream;

public class Problem7
{
    public static void main(String[] args) {
        int n=5;
        int arr[] = {1,2,3,4,5};
        int sum = IntStream.of(arr).sum();
        // System.out.println(sum);
        System.out.println("The sum of the elements of the arrays is: " + sum);
    }
}