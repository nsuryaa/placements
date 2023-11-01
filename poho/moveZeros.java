import java.util.Arrays;

public class moveZeros {
    public int[] moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1)
            return nums;

        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        moveZeros solution = new moveZeros();

        // Example usage of the moveZeroes method
        int[] nums1 = { 0, 1, 0, 3, 12 };
        System.out.println("Original Array: " + Arrays.toString(nums1));
        solution.moveZeroes(nums1);
        System.out.println("Modified Array: " + Arrays.toString(nums1));

        int[] nums2 = { 1, 2, 3, 4, 5 };
        System.out.println("Original Array: " + Arrays.toString(nums2));
        solution.moveZeroes(nums2);
        System.out.println("Modified Array: " + Arrays.toString(nums2));
    }
}
