import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        // IF STATEMENTS
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Please enter your name: ");
        name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        // GROUP 1
        if(name.isEmpty()) {
            System.out.println("You didn't enter a name!");
        }
        else{
            System.out.println("Welcome " + name + "!");
        }

        // GROUP 2
        if(age >= 65){
            System.out.println("You are an senior.");
        }
        else if(age >= 18){
            System.out.println("You are a adult.");
        }
        else if(age < 0){
            System.out.println("You are a fetus!");
        }
        else if(age == 0){
            System.out.println("You are a newborn.");
        }
        else{
            System.out.println("You are a child.");
        }

        // GROUP 3
        if(isStudent){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are not a student.");
        }

        scanner.close();
    }
}
