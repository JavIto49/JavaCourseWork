import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // while loop = repeats some code forever
        // while some condition remains true
        // Sometimes you may not even enter the loop at all depending on the current condition

        Scanner scanner = new Scanner(System.in);
        String name = "";

        // Before while loop approach
        if(name.isEmpty()){
            System.out.print("Please enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);

        // After while loop approach
        while(name.isEmpty()){
            System.out.print("Please enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);


        // CAUTION: INFINITE LOOPS
        // Will continue to loop without end when a condition cannot change within the loop
        /*while(1 == 1){
            System.out.println("HELP! I'M STUCK IN A LOOP!!!");
        }
        */

        // While loop example 2
        System.out.println();
        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game...");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }
        System.out.println("You have quit the game!");
        System.out.println();

        // While loop example 3
        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age cannot be negative!");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are " + age + " years old.");
        System.out.println();

        // do while loop example
        // You execute the code at least once then check the condition after to see if looping continues
        double balance = 50.00;
        double withdrawal = 0.00;

        do{
            System.out.printf("Your available balance is $%.2f\n", balance);
            System.out.print("Enter the amount you would like to withdraw: ");
            withdrawal = scanner.nextDouble();
            balance -= withdrawal;
        }while(balance < 0);
        System.out.println();
        System.out.printf("You have selected $%.2f\n", withdrawal);
        System.out.printf("Your remaining balance is $%.2f\n", balance);
        System.out.println();

        // do while loop example 2
        int number = 0;

        do{
            System.out.print("Please enter a number between 1 and 10: ");
            number = scanner.nextInt();
        }while((number < 1 || number > 10));

        System.out.println("You picked " + number + "!");
        scanner.close();
    }
}