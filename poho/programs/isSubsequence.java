
import java.util.*;

class isSubsequence {
    static boolean issubsequence(String s1, String s2, int n, int m) {

        if (n == 0)
            return true; // we reach the end of the s1, so return true;
        if (m == 0)
            // we reached end of S2, with characters
            // remaining in s1, so return false
            return false;
        if (s1.charAt(n - 1) == s2.charAt(m - 1))
            // moving ahead in both strings
            return issubsequence(s1, s2, n - 1, m - 1);
        else
            // moving ahead in only S2
            return issubsequence(s1, s2, n, m - 1);

    }

    public static void main(String args[]) {
        String S1 = "fgn", S2 = "faang";
        if (issubsequence(S1, S2, S1.length(), S2.length()))
            System.out.println(S1 + " is subsequence of " + S2);
        else
            System.out.println(S1 + " is not subsequence of " + S2);
    }
}