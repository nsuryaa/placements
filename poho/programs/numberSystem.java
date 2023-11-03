import java.util.Scanner;

public class numberSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
        int[] a = new int[10000];
        a[0] = 3;
        a[1] = 4;

        for (int i = 0; i < n; i++) {
            a[++k] = (a[i] * 10) + 3;
            a[++k] = (a[i] * 10) + 4;
        }
        System.out.print(a[n - 1]);

        scanner.close();
    }
}
