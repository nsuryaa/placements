package tcs_nqt.Arrays;
import java.util.*;
import java.math.*;

public class Problem3 {
    public static int[] getSecondOrderElements(int n, int[] a) {
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;

        for (i = 0; i < n; i++) {
            large = Math.max(large, a[i]);
            small = Math.min(small, a[i]);
        }

        for (i = 0; i < n; i++) {
            if (a[i] > second_large && a[i] != large) {
                second_large = a[i];
            }
            if (a[i] < second_small && a[i] != small) {
                second_small = a[i];
            }
        }

        // Corrected return statement
        return new int[]{second_large, second_small};
    }
}