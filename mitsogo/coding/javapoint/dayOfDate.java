package javapoint;
import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

public class dayOfDate {
    public static void main(String[] args) {
        String inputDateStr = "2023-09-28";
        LocalDate date = LocalDate.parse(inputDateStr);
        String dayOfWeek = date.getDayOfWeek().toString();
        System.out.println("The day of the week for " + inputDateStr + " is " + dayOfWeek);
    }
}
