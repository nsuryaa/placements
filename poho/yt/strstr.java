public class strstr {

    public static int strstr(String s, String x) {
        int index = -1;
        int sLen = s.length();
        int xLen = x.length();

        for (int i = 0; i <= sLen - xLen; i++) {
            int j;
            for (j = 0; j < xLen; j++) {
                if (s.charAt(i + j) != x.charAt(j)) {
                    break;
                }
            }
            if (j == xLen) { // If we reached the end of the substring, it's a match.
                index = i;
                return index;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String s = "surya";
        String x = "su";
        int index = strstr(s, x);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }
    }
}
