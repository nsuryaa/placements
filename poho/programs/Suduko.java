import java.util.Scanner;

public class Suduko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[][] {
                { 5, 1, 3, 6, 8, 7, 2, 4, 9 },
                { 8, 4, 9, 5, 2, 1, 6, 3, 7 },
                { 2, 6, 7, 3, 4, 9, 5, 8, 1 },
                { 1, 5, 8, 4, 6, 3, 9, 7, 2 },
                { 9, 7, 4, 2, 1, 8, 3, 6, 5 },
                { 3, 2, 6, 7, 9, 5, 4, 1, 0 },
                { 7, 8, 2, 9, 3, 4, 1, 5, 6 },
                { 6, 3, 5, 1, 7, 2, 8, 9, 4 },
                { 4, 9, 1, 8, 5, 6, 7, 2, 3 } };

        // System.out.println("Enter the Sudoku matrix (9x9):");
        // for (int i = 0; i < 9; i++) {
        // for (int j = 0; j < 9; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        if (isValidSudoku(arr)) {
            System.out.println("Sudoku is valid");
        } else {
            System.out.println("Sudoku is not valid");
        }
    }

    private static boolean isValidSudoku(int[][] arr) {
        for (int i = 0; i < 9; i++) {
            int sumRow = 0;
            int sumColumn = 0;
            for (int j = 0; j < 9; j++) {
                sumRow += arr[i][j];
                sumColumn += arr[j][i];
            }
            if (sumRow != 45 || sumColumn != 45) {
                return false;
            }
        }

        // System.out.println("Sudoku is valid");
        return true;
    }
}
