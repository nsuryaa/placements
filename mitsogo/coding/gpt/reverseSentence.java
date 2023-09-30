package coding.gpt;

import java.util.*;

public class reverseSentence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    String reversedSentence = reverseSentence(sentence);
    System.out.println("Reversed sentence : " + reversedSentence);
    sc.close();
  }

  private static String reverseSentence(String sentence) {

    String[] words = sentence.split(" ");

    StringBuilder sb = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
      sb.append(words[i]).append(" ");
    }
    return sb.toString().trim();
  }
}