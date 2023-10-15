// public class BelzabarNumber {

//     // Function to check if a number is prime
//     private static boolean isPrime(int num) {
//         if (num <= 1) {
//             return false;
//         }
//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     // Function to check if a number is a Belzabar number
//     public static boolean isBelzabarNumber(int num) {
//         // Check if the number is (n * (n + 20)) or (n * (n - 20)) for some prime n
//         for (int n = 2; n <= num / 2; n++) {
//             if (isPrime(n) && (num == n * (n + 20) || num == n * (n - 20))) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         // Example usage
//         int number = 40;
//         boolean result = isBelzabarNumber(number);
//         System.out.println("Is " + number + " a Belzabar number? " + result);
//     }
// }
