package coding.gpt;

// <!-- Write a code to count number of dictionary words in a paragraph? -->
import java.util.*;

public class DictionaryWord {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a paragraph: ");
    String paragraph = sc.nextLine();
    int countWords = countDictionaryWords(paragraph);
    System.out.println("No of words : " + countWords);
    sc.close();
  }

  private static int countDictionaryWords(String paragraph) {

    String[] words = paragraph.split("\\s+");

    int count = 0;
    for (String word : words) {
      if (word.matches("[a-zA-Z]+")) {
        count++;
      }
    }
    return count;
  }
}