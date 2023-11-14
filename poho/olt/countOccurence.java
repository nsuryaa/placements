import java.util.HashMap;

public class countOccurence {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 2, 2, 3, 5, 5 };

        printCountOfRepeatedNumbers(array);
    }

    static void printCountOfRepeatedNumbers(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the count of repeated numbers
        for (int num : frequencyMap.keySet()) {
            System.out.print(num + "->" + frequencyMap.get(num) + " ");
        }
    }
}
