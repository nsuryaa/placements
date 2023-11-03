import java.util.Scanner;

public class fatherSon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size:");
        int number = scanner.nextInt();

        String[][] son = new String[100][100];
        String[][] father = new String[100][100];
        String[] grandfather = new String[100];

        int grandchildrenCount = 0;
        int fatherPosition = 0;

        System.out.println("Enter the son and father name:");
        for (int i = 0; i < number; i++) {
            son[i][0] = scanner.next();
            father[i][0] = scanner.next();
        }

        System.out.print("Enter the grandfather name:");
        String grandFatherName = scanner.next();

        for (int i = 0; i < number; i++) {
            if (grandFatherName.equals(father[i][0])) {
                fatherPosition = i;
                break;
            }
        }

        for (int i = 0; i < number; i++) {
            if (son[fatherPosition][0].equals(father[i][0])) {
                grandchildrenCount++;
            }
        }

        System.out.println("\n" + grandFatherName + " has " + grandchildrenCount + " grandchildren");
    }
}
