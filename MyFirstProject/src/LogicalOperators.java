import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT

        //double temp = 20;
        //boolean isSunny = false;
        double temp = -10;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is good!");
            System.out.println("It is sunny outside.");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is good!");
            System.out.println("It is cloudy outside.");
        }
        else if (temp > 30 || temp < 0){
            System.out.println("The weather is bad!");
        }


        Scanner scanner = new Scanner(System.in);
        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("INVALID USERNAME");
            System.out.println("Your username must be between 4-12 characters!");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("INVALID USERNAME");
            System.out.println("Your username cannot contain spaces or underscores!");
        }
        else{
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}