package coding;

// <!-- Reduce the sum to zero
// a no is given you have to reduce the no to zero if no is prime reduce it by 1 or reduce it by nearest prime. -->

import java.util.*;

public class reduceToZero {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number");
    int number = sc.nextInt();
    reducetozero(number);
    sc.close();

  }

  private static void reducetozero(int number) {

    while (number > 0) {
      if (isPrime(number)) {
        // If the number is prime reduce it by 1
        number -= 1;
      } else {
        // If the number is not Prime reduce it by the nearest prime

        int nearestPrime = findNearestPrime(number);
        number -= nearestPrime;
      }
      System.out.println("Current Number = " + number);
    }
    System.out.println("The number has been reduced to zero");
  }

  private static int findNearestPrime(int number) {
    int smallerPrime = number - 1;
    int largerPrime = number + 1;

    while (!isPrime(smallerPrime) && !isPrime(largerPrime)) {
      smallerPrime--;
      largerPrime++;
    }

    return isPrime(smallerPrime) ? smallerPrime : largerPrime;
  }

  private static boolean isPrime(int number) {
    if (number <= 1) {
      return false;

    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}