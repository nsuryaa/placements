public class longestMountain {
    public int longestMountain(int[] arr) {
        int longest = 0;
        int startIndex = 0;
        int endIndex = arr.length - 1;

        for (int i = 1; i < endIndex; i++) {
            int topIndex = i;
            int leftIndex = i - 1;
            int rightIndex = i + 1;

            if (arr[leftIndex] >= arr[topIndex] || arr[rightIndex] >= arr[topIndex]) {
                continue;
            }

            while (leftIndex != startIndex && arr[leftIndex] > arr[leftIndex - 1]) {
                leftIndex--;
            }

            while (rightIndex != endIndex && arr[rightIndex] > arr[rightIndex + 1]) {
                rightIndex++;
            }

            longest = Math.max(longest, rightIndex - leftIndex + 1);
        }

        return longest;
    }

    public static void main(String[] args) {
        longestMountain solution = new longestMountain();

        // Test cases
        int[] arr1 = { 1, 3, 1, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5 };
        System.out.println("Longest Mountain in arr1: " + solution.longestMountain(arr1));

    }
}
