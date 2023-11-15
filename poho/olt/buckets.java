
// Java code for the approach
import java.util.Arrays;

public class buckets {

    // Function to find the maximum number
    // of buckets that can be filled with
    // the amount of water available
    public static int maxBuckets(int[] buckets, int n,
            int liquid) {
        int filledBuckets = 0;
        int liquidRemaining = liquid;

        // Iterate through the buckets in descending order
        // of size
        for (int i = n - 1; i >= 0; i--) {
            if (buckets[i] <= liquidRemaining) {
                filledBuckets += liquidRemaining / buckets[i];
                liquidRemaining %= buckets[i];
            }
        }

        return filledBuckets;
    }

    // Driver code
    public static void main(String[] args) {

        // Input array
        int[] buckets = { 7, 3, 5, 4, 1 };
        int n = buckets.length;
        int liquid = 9;

        // Function call
        int maxFilledBuckets = maxBuckets(buckets, n, liquid);

        // Printing final answer
        System.out.println("Maximum filled buckets: "
                + maxFilledBuckets);
    }
}
