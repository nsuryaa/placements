public class EditDistance {

    public static int minEditDistance(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        // Create a table to store results of subproblems
        int[][] dp = new int[m + 1][n + 1];

        // Fill the dp table
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // If the first string is empty, insert all characters of the second string
                if (i == 0) {
                    dp[i][j] = j;
                }
                // If the second string is empty, remove all characters of the first string
                else if (j == 0) {
                    dp[i][j] = i;
                }
                // If last characters are the same, ignore the last characters and recur for the remaining strings
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If the last character is different, consider all possibilities and find the minimum
                else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }

        // The bottom-right cell contains the minimum number of edits
        return dp[m][n];
    }

    public static void main(String[] args) {
        String str1 = "Sunday";
        String str2 = "Saturday";
        int result = minEditDistance(str1, str2);
        System.out.println(result);
    }
}




// def min_edit_distance(str1, str2):
//     m, n = len(str1), len(str2)

//     # Create a table to store results of subproblems
//     dp = [[0] * (n + 1) for _ in range(m + 1)]

//     # Fill the dp table
//     for i in range(m + 1):
//         for j in range(n + 1):
//             # If the first string is empty, insert all characters of the second string
//             if i == 0:
//                 dp[i][j] = j
//             # If the second string is empty, remove all characters of the first string
//             elif j == 0:
//                 dp[i][j] = i
//             # If last characters are the same, ignore the last characters and recur for the remaining strings
//             elif str1[i - 1] == str2[j - 1]:
//                 dp[i][j] = dp[i - 1][j - 1]
//             # If the last character is different, consider all possibilities and find the minimum
//             else:
//                 dp[i][j] = 1 + min(dp[i - 1][j],       # Remove
//                                   dp[i][j - 1],       # Insert
//                                   dp[i - 1][j - 1])   # Replace

//     # The bottom-right cell contains the minimum number of edits
//     return dp[m][n]

// # Example usage
// str1 = "Sunday"
// str2 = "Saturday"
// result = min_edit_distance(str1, str2)
// print(result)

