import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //----------------------------------------------------------------
    /*    // Print statements
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

        scanner.close();*/
        //----------------------------------------------------------------

        /*// Calculate the area of a rectangle
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.print("The area of the rectangle is: " + area + "cm^2");

        scanner.close();*/
        //----------------------------------------------------------------

        /*// MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (animal): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb ending with -ing (action): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();


        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
        */
        //----------------------------------------------------------------

        /*// Arithmetic Operators
        int x = 10;
        int y = 2;

        int a;
        int b;
        int c;
        int d;
        int e;

        a = x + y;
        b = x - y;

        c = x * y;
        d = x / y;

        e = x % y;

        System.out.println("Result of a: " + a + "\nResult of b: " + b);
        System.out.println("Result of c: " + c + "\nResult of d: " + d);
        System.out.println("Result of e: " + e);
        System.out.println();

        // Augmented Assignment Operators
        int f = 10;
        int g = 20;

        f += g;
        //f -= g;
        //f *= g;
        //f /= g;
        //f %= g;

        System.out.println(f);

        // Increment and Decrement Operators
        int j = 5;
        j--;
        j++;
        System.out.println(j);

        // Order of Operations [P-E-M-D-A-S]
        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);*/
        //----------------------------------------------------------------

        /*// SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();*/
        //----------------------------------------------------------------

        // IF STATEMENTS
        /*Scanner scanner = new Scanner(System.in);

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

        scanner.close();*/
        //---------------------------------------------------------------------

        // RANDOM NUMBERS CLASS
        /*Random rand = new Random();

        int number1;
        int number2;
        int number3;
        number1 = rand.nextInt(1,101);
        number2 = rand.nextInt(1,101);
        number3 = rand.nextInt(1,101);
        System.out.println("First number is: " + number1 + "\nSecond number is: " + number2 + "\nThird number is: " + number3);


        double number4;
        number4 = rand.nextDouble();
        System.out.println(number4);


        boolean isHeads;
        isHeads = rand.nextBoolean();
        if(isHeads) {
            System.out.println("HEADS!");
        }
        else {
            System.out.println("TAILS!");
        }*/
        //---------------------------------------------------------------------

        /*// MATH CLASS
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2,3);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(2.7);
        result = Math.ceil(3.14);
        result = Math.floor(3.99);
        result = Math.max(10,20);
        result = Math.min(10,20);

        System.out.println(result);

        // HYPOTENUSE c = Math.sqrt(a^2 + b^2)
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter the length of side a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypotenuse of this triangle is: " + c + "cm");

        // CIRCUMFERENCE = 2 * Math.PI * radius;
        // AREA = Math.PI * Math.pow(radius,2);
        // VOLUME = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("The circumference is: %.1fcm\n" , circumference);
        System.out.printf("The area is: %.1fcm^2\n" , area);
        System.out.printf("The volume is: %.1fcm^3\n" , volume);
*/
        //---------------------------------------------------------------------

    }
}