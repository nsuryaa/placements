package coding.gpt;

import java.util.*;

public class DecimalToBinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a decimal number: ");
    int decimalNumber = sc.nextInt();
    String binaryRepresentation = convertToBinary(decimalNumber);
    System.out.println("Binary Representation:" + binaryRepresentation);
    sc.close();
  }

  private static String convertToBinary(int decimalNumber) {

    return Integer.toBinaryString(decimalNumber);
  }
}