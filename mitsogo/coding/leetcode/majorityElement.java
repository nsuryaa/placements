package leetcode;

import java.util.Arrays;

public class majorityElement {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 2, 2, 2, 2 };
    System.out.println(majorityElement(nums));
  }

  public static int majorityElement(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    return nums[n / 2];
  }
}
