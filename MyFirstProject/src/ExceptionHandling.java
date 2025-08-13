import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        // (Dividing by zero, file not found, mismatch input type)
        // Surround any dangerous code with a try{} block
        // try{}, catch{}, finally{}

        try{
            System.out.println(1 / 0); // Dangerous code that may/will result in an exception, interrupting the program
        }
        // You setup a parameter, ArithmeticException is the type and the name is e for reference
        catch(ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!"); // Now the program knows what to do when encountering the exception and won't be interrupted
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        // Anytime you need to accept user input, it's always considered dangerous code since the user can type anything
        try{
            System.out.print("Enter a number: ");
            int number = scanner.nextInt(); // If a user types in the wrong input, this results in an exception
            System.out.println(number);
        }
        catch(InputMismatchException e){
            System.out.println("YOU NEED TO ENTER A NUMBER!");
        }

        System.out.println();

        // A catch-all statement can also be used to handle all exceptions at once, but this is not considered good
        // practice as you want to let the user know what exactly went wrong. But it is handy when you place it last in a chain
        // of catches as it acts as a safety net if all else fails, although vague at least the program will finish running.
        try{
            System.out.print("Enter your phone number: ");
            int phoneNumber = scanner.nextInt();
            System.out.println(phoneNumber);
        }
        catch(ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
        catch(InputMismatchException e){
            System.out.println("YOU NEED TO ENTER A PHONE NUMBER!");
        }
        catch (Exception e) {
            // SAFETY NET
            System.out.println("SOMETHING WENT WRONG!");
        }

        System.out.println();

        // finally{} will always execute whether there is an exception or not. It is an optional block.
        // It is a place where you want to clean up any resources.
        try{
            System.out.print("Enter your SSN: ");
            int socialSecurityNumber = scanner.nextInt();
            System.out.println(socialSecurityNumber);
        }
        catch(ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
        catch(InputMismatchException e){
            System.out.println("YOU NEED TO ENTER A SOCIAL SECURITY NUMBER!");
        }
        catch (Exception e) {
            // SAFETY NET
            System.out.println("SOMETHING WENT WRONG!");
        }
        finally {
            // This is done because as an example, if an exception was encountered, the scanner might not be closed.
            scanner.close(); // here we are using the finally block to close up the scanner.
            // It can also be useful for closing up a file that has been left open.
            System.out.println("This always executes!");
        }

        System.out.println();

        // There is also try{} with resources. Rather than declaring the scanner outside the try block you can place it
        // inside the parenthesis. Java will then automatically close those resources when it's done opening them.
        try(Scanner scanner1 = new Scanner(System.in)){
            System.out.print("Enter your favorite color: ");
            String favoriteColor = scanner1.nextLine();
        }
        catch(InputMismatchException e){
            System.out.println("YOU NEED TO ENTER A COLOR!");
        }
        finally{
            //scanner1.close(); Not needed here since the scanner is handled within the try.
        }
    }
}