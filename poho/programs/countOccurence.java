
// import java.util.Scanner;

// public class countOccurence {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int[] num = new int[100];
//         int[] count = new int[100];
//         // Declare counter variable i
//         // and temp variable that will
//         // temporarily hold the value
//         // at a certain index of num[] array
//         int i, temp = 0;
//         System.out.println("Enter the integers between 1 and 100: ");

//         // Initialize num[] array with user input
//         for (i = 0; i < num.length; i++) {
//             num[i] = input.nextInt();
//             // expected input will end when user enters zero
//             if (num[i] == 0) {
//                 break;
//             }
//         } // end of for loop

//         // value at a given index of num array
//         // will be stored in temp variable
//         // temp variable will act as an index value
//         // for count array and keep track of number
//         // of occurences of each number
//         for (i = 0; i < num.length; i++) {
//             temp = num[i];
//             count[temp]++;
//         } // end of for looop

//         for (i = 1; i < count.length; i++) {

//             if (count[i] > 0 && count[i] == 1) {
//                 System.out.printf("%d occurs %d time\n", i, count[i]);
//             } else if (count[i] >= 2) {
//                 System.out.printf("%d occurs %d times\n", i, count[i]);
//             }

//         } // end of for loop

//     }// end of main
// }// end of CountOccurrenceOfNumbers

// Code 2

import java.util.HashMap;

public class countOccurence {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 2, 2, 3, 5, 5 };

        printCountOfRepeatedNumbers(array);
    }

    static void printCountOfRepeatedNumbers(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the count of repeated numbers
        for (int num : frequencyMap.keySet()) {
            System.out.println(num + " - " + frequencyMap.get(num));
        }
    }
}
