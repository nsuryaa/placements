public class Pattern1 {
    public static void main(String[] args) {
        int n = 3, o = 1, e = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(o + " ");
                    o = o + 2;
                } else {

                    System.out.print(e + " ");
                    e = e + 2;
                }
            }
            System.out.println();
        }
    }
}