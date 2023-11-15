import java.util.HashMap;
import java.util.Map;

class _26 {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] array = { 1, 1, 2 };
        int length = removeDuplicates(array);
        System.out.println("Length after removing duplicates: " + length);
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}