import java.util.Scanner;

public class PrintStatements {
    public static void main(String[] args) {
        // Print statements
        System.out.println("Hello!");
        System.out.println("I like pizza, it's really good");
        System.out.println("Buy me pizza!");

        System.out.println();
        // 2 Steps to creating a variable
        int age; // Declaration
        int miles = 21; // Declaration and assignment
        int attendees = 50;

        System.out.println(miles);

        System.out.println("I drove about " + miles + " miles today!");

        double price = 499.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("The Nintendo Switch 2 costs: $" + price);
        System.out.println();

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println("You need a grade of an " + grade + " to earn an honor award.");
        System.out.println();

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;
        System.out.println(isStudent);

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

        String name = "Joseph Villalobos";
        String food = "Pizza";
        String email = "merk1the1game@gmail.com";
        System.out.println("Hello " + name);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String enteredName = scanner.nextLine();
        System.out.println("Welcome " + enteredName + "!");
        System.out.println();

        System.out.print("Please enter your age: ");
        int enteredAge = scanner.nextInt();
        System.out.println("You are " + enteredAge + " years old.");
        System.out.println();

        System.out.print("Please enter your GPA: ");
        double enteredGPA = scanner.nextDouble();
        System.out.println("You GPA is: " + enteredGPA);
        System.out.println();

        System.out.print("Are you an honors society member? (true/false): ");
        boolean isHonorSociety = scanner.nextBoolean();
        if(isHonorSociety){
            System.out.println("You are an honor society member!");
        }
        else{
            System.out.println("You are not an honor society member.");
        }

        scanner.close();
    }
}
