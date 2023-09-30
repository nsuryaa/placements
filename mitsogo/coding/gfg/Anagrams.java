package coding.gfg;
// https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

class Anagrams {

  /*
   * function to check whether two strings are
   * anagram of each other
   */
  static boolean areAnagram(String str1, String str2) {
    // Get lengths of both strings
    int n1 = str1.length();
    int n2 = str2.length();

    char tempArray[] = str1.toCharArray();
    char tempArray2[] = str2.toCharArray();

    // If length of both strings is not same,
    // then they cannot be anagram
    if (n1 != n2)
      return false;
    // Sort both strings
    Arrays.sort(tempArray);
    Arrays.sort(tempArray2);

    // Compare sorted strings
    for (int i = 0; i < n1; i++)
      if (tempArray[i] != tempArray2[i])
        return false;

    return true;
  }

  /* Driver Code */
  public static void main(String args[]) {
    String str1 = "listen";
    String str2 = "silent";
    // Function Call
    if (areAnagram(str1, str2))
      System.out.println("The two strings are"
          + " anagram of each other");
    else
      System.out.println("The two strings are not"
          + " anagram of each other");
  }
}