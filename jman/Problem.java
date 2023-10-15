import java.util.HashMap;

public class Problem {
    public int numIdenticalPairs(int[] guestList) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int ans = 0;
        
        for (int friend : guestList) {
            int friendCount = hm.getOrDefault(friend, 0);
            ans += friendCount;
            hm.put(friend, friendCount + 1);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        // Example usage
        Problem solution = new Problem();
        int[] guestList = {0,-1,5};
        int result = solution.numIdenticalPairs(guestList);
        System.out.println("Number of identical pairs: " + result);
    }
}
