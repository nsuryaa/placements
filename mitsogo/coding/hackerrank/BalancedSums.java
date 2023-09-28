import java.util.List;

public class BalancedSums {

    public static String balancedSums(List<Integer> arr) {
        int sum = 0;
        int leftSum = 0;

        // Calculate the sum of all elements in the array
        for (int num : arr) {
            sum += num;
        }

        // Iterate through the array and check if there is an index where the left sum equals the right sum
        for (int i = 0; i < arr.size(); i++) {
            if (leftSum == sum - leftSum - arr.get(i)) {
                return "YES";
            }
            leftSum += arr.get(i);
        }

        return "NO";
    }

    public static void main(String[] args) {
        // You can pass your array as a List here
        List<Integer> arr = List.of(1, 2, 3, 3);

        String result = balancedSums(arr);
        System.out.println(result);
    }
}
