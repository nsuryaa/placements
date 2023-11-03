public class welcomeZoho {

    // Function to search for a substring in a 2D matrix
    public static int[][] searchSubstring(char[][] matrix, String substring) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int subLen = substring.length();

        // Search from left to right in each row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols - subLen + 1; j++) {
                // Check if the substring is present in the row
                if (new String(matrix[i], j, subLen).equals(substring)) {
                    int[] start = {i, j};
                    int[] end = {i, j + subLen - 1};
                    return new int[][]{start, end};  // Return the start and end indices
                }
            }
        }

        // Search from top to bottom in each column
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows - subLen + 1; j++) {
                // Build a substring from the column
                StringBuilder columnSubstring = new StringBuilder();
                for (int k = j; k < j + subLen; k++) {
                    columnSubstring.append(matrix[k][i]);
                }
                // Check if the substring is present in the column
                if (columnSubstring.toString().equals(substring)) {
                    int[] start = {j, i};
                    int[] end = {j + subLen - 1, i};
                    return new int[][]{start, end};  // Return the start and end indices
                }
            }
        }

        return null;  // Return null if the substring is not found
    }

    // Main method to test the function
    public static void main(String[] args) {
        char[][] matrix = {
            {'W', 'E', 'L', 'C', 'O'},
            {'M', 'E', 'T', 'O', 'Z'},
            {'O', 'H', 'O', 'C', 'O'},
            {'R', 'P', 'O', 'R', 'A'},
            {'T', 'I', 'O', 'N', ' '}
        };

        String substring = "TOO";
        int[][] result = searchSubstring(matrix, substring);

        // Display the results
        if (result != null) {
            int[] startIndex = result[0];
            int[] endIndex = result[1];
            System.out.println("Start index: {" + startIndex[0] + ", " + startIndex[1] + "}");
            System.out.println("End index: {" + endIndex[0] + ", " + endIndex[1] + "}");
        } else {
            System.out.println("Substring not found.");
        }
    }
}
