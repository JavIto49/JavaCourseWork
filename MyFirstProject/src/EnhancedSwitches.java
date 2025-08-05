import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statements
        // Great substitute if you are using too many if/else statements
        String day;
        System.out.print("What day of the week is it?: ");
        Scanner scanner = new Scanner(System.in);
        day = scanner.nextLine();
        day = day.substring(0, 1).toUpperCase() + day.substring(1);

        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It is a weekday");
            case "Saturday","Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " is not a day of the week");
        }
        scanner.close();
    }
}