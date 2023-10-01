import java.util.Arrays;

// write a java program to display an array of the number of elements to the left of each element of an array greater in magnitude than the particular element.
public class LeftElementsCount {

    public static void main(String[] args) {
        int[] inputArray = {3, 1, 6, 2, 7, 30, 20, -10};

        int[] result = countLeftElements(inputArray);

        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Count of elements to the left greater in magnitude:");
        System.out.println(Arrays.toString(result));
    }

    private static int[] countLeftElements(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < i; j++) {
                if (Math.abs(arr[j]) > Math.abs(arr[i])) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }
}
