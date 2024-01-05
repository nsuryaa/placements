public class Bss {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_profit = 0;

        for (int i = 1; i < prices.length; i++) {
            max_profit = Math.max(max_profit, prices[i] - min_price);
            min_price = Math.min(prices[i], min_price);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        // Example usage of the maxProfit method
        Bss solution = new Bss();
        int[] examplePrices = { 7, 1, 5, 3, 6, 4 };
        int result = solution.maxProfit(examplePrices);
        System.out.println("Maximum profit: " + result);
    }
}
