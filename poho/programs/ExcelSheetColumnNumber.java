// Given a string column title that represents the column title 
// as appears in an Excel sheet, return its corresponding column number.
public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (char c : columnTitle.toCharArray()) {
            int d = c - 'A' + 1;
            result = result * 26 + d;
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
        String columnTitle = "BCD";
        int result = solution.titleToNumber(columnTitle);
        System.out.println("The corresponding column number for '" + columnTitle + "' is: " + result);
    }
}
