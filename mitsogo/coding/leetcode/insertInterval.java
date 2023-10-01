package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.ietf.jgss.Oid;

class insertInterval {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get the number of intervals
    System.out.print("Enter the number of intervals: ");
    int n = scanner.nextInt();

    int[][] intervals = new int[n][2];

    // Get intervals from the user
    for (int i = 0; i < n; i++) {
      System.out.print("Enter start of interval " + (i + 1) + ": ");
      intervals[i][0] = scanner.nextInt();
      System.out.print("Enter end of interval " + (i + 1) + ": ");
      intervals[i][1] = scanner.nextInt();
    }

    // Get new interval from the user
    System.out.print("Enter start of the new interval: ");
    int newStart = scanner.nextInt();
    System.out.print("Enter end of the new interval: ");
    int newEnd = scanner.nextInt();

    int[] newInterval = { newStart, newEnd };

    insertInterval solution = new insertInterval();
    int[][] result = solution.insert(intervals, newInterval);

    // Display the result
    System.out.println("Merged Intervals:");
    for (int[] interval : result) {
      System.out.println("[" + interval[0] + ", " + interval[1] + "]");
    }

    // Close the scanner
    scanner.close();
  }

  public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> result = new ArrayList<>();

    for (int[] in : intervals) {
      if (in[1] < newInterval[0]) {
        result.add(in);
      } else if (newInterval[1] < in[0]) {
        result.add(newInterval);
        newInterval = in;
      } else {
        newInterval[0] = Math.min(newInterval[0], in[0]);
        newInterval[1] = Math.max(newInterval[1], in[1]);
      }
    }
    result.add(newInterval);

    return result.toArray(new int[result.size()][]);
  }
}
