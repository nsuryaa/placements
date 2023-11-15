public class twoSumTwo {
    public static void main(String[] args) {
        twoSumTwo solution = new twoSumTwo();
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(numbers, target);

        System.out.println("Indices of the two numbers that add up to the target:");
        System.out.println(result[0] + " " + result[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] < target) {
                l++;
            } else {
                r--;
            }
        }

        return new int[] { l + 1, r + 1 };
    }
}
