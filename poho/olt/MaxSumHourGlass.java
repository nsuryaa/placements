public class MaxSumHourGlass {
    public int maxSum(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            // Running the for loop for the row-2 times
            for (int j = 0; j < grid[0].length - 2; j++) {
                // Running the inner for loop for the col-2 times
                int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j]
                        + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example usage:
        int[][] grid = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        MaxSumHourGlass maxSumHourGlass = new MaxSumHourGlass();
        int result = maxSumHourGlass.maxSum(grid);
        System.out.println("Maximum Hourglass Sum: " + result);
    }
}
