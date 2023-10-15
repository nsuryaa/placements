import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DistinctYearsCounter4 {

    public static int countDistinctYears(String document) {
        // Use regular expression to find all occurrences of a four-digit year
        Pattern pattern = Pattern.compile("\\b\\d{4}\\b");
        Matcher matcher = pattern.matcher(document);

        // Use Set to get distinct years
        Set<String> distinctYears = new HashSet<>();
        
        while (matcher.find()) {
            distinctYears.add(matcher.group());
            // System.out.println(matcher.group());
        }

        // Return the count of distinct years
        return distinctYears.size();
    }

    public static void main(String[] args) {
        // Example usage:
        String document = "UN was established on 24-10-1945. India got freedom on 15-08-1945.";
        int result = countDistinctYears(document);
        System.out.println(result);
    }
}
