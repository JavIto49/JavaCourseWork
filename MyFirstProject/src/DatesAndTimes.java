import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {
    public static void main(String[] args) {

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        // LocalDate
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // LocalTime
        LocalTime time = LocalTime.now();
        System.out.println(time);

        // LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // UTC timestamp
        Instant instant = Instant.now();
        System.out.println(instant);

        // Custom format
        LocalDateTime dateTime2 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // Instead of getting the date time now, you can create a custom object
        LocalDate date2 = LocalDate.of(2025, 12, 25);
        System.out.println(date2);

        LocalDateTime dateTime3 = LocalDateTime.of(2025, 4, 1, 12, 30, 0);
        System.out.println(dateTime3);

        // You can also compare dates
        LocalDateTime dateTime4 = LocalDateTime.of(2025, 5, 5, 8, 25, 0);

        if(dateTime3.isBefore(dateTime4)) {
            System.out.println(dateTime3 + " is earlier " + dateTime4);
        }
        else if(dateTime3.isAfter(dateTime4)) {
            System.out.println(dateTime3 + " is later" + dateTime4);
        }
        else if(dateTime3.isEqual(dateTime4)) {
            System.out.println(dateTime3 + " is equal to " + dateTime4);
        }

    }
}
