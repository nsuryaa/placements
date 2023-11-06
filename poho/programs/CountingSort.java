public class CountingSort {
    public String countSort(String arr) {
        int[] count = new int[26];

        for (int i = 0; i < arr.length(); i++) {
            int temp = (int) arr.charAt(i) - 97;
            count[temp]++;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i]; j++) {
                ans.append((char) (i + 97));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();

        // Test the countSort method
        String input = "edsab";
        String sortedString = countingSort.countSort(input);
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedString);
    }
}
