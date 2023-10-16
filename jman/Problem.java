// import java.util.Arrays;

// public class Problem {

//     // Function to count the number of teams for each query
//     static int[] countTeams(int[] rating, int[][] queries) {
//         int n = rating.length;
//         int q = queries.length;
//         int[] result = new int[q];

//         // Check if an employee is part of a team
//         boolean[] isTeam = new boolean[n];
//         for (int i = 1; i < n - 1; i++) {
//             if (rating[i] > rating[i - 1] && rating[i] > rating[i + 1]
//                     || rating[i] < rating[i - 1] && rating[i] < rating[i + 1]) {
//                 isTeam[i] = true;
//             }
//         }

//         // Calculate the number of teams for each query
//         for (int i = 0; i < q; i++) {
//             int l = queries[i][0];
//             int r = queries[i][1];

//             // Count the number of teams within the specified range [l, r]
//             int teamCount = 0;
//             for (int j = l - 1; j < r; j++) {
//                 if (isTeam[j]) {
//                     teamCount++;
//                 }
//             }

//             result[i] = teamCount;
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         // Example usage
//         int[] ratings = {1, 1};
//         int[][] queries = {{1, 2}, {1, 1}};

//         // Calculate the number of teams for each query
//         int[] result = countTeams(ratings, queries);

//         // Output the result
//         System.out.println(Arrays.toString(result));
//     }
// }
