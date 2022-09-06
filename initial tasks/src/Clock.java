import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class Clock {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        LocalTime theTime = LocalTime.now();
        DateTimeFormatter theTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = theTime.format(theTimeFormatter);
             System.out.printf("The current " + ANSI_RED + "time" + ANSI_RESET + " is %s \n", formattedTime);
    }
}
