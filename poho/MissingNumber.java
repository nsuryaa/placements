
// Given an array nums containing n distinct numbers in the range [0, n], 
// return the only number in the range that is missing from the array.

public class MissingNumber {
    public static int missingNumber(int[] a, int N) {

        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); // XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; // XOR up to [1..ls.N]

        return (xor1 ^ xor2); // the missing number
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = { 1, 2, 4, 5 };

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}
