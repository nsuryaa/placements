public class MissingElements {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 3, 1, 2 };

        findMissingElements(array1, array2);
    }

    private static void findMissingElements(int[] array1, int[] array2) {
        System.out.print("Missing elements: ");

        for (int i = 0; i < array1.length; i++) {
            boolean found = false;

            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(array1[i] + " ");
            }
        }
    }
}
