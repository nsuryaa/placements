import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        int currentNumber = 1;

        for (int i = 1; i <= n; i++) {
            int nextNumber = currentNumber;
            for (int j = 1; j <= i; j++) {
                System.out.print(nextNumber + " ");
                nextNumber += 2;
            }
            System.out.println();
            currentNumber += i * 2;
        }

        scanner.close();
    }
}
