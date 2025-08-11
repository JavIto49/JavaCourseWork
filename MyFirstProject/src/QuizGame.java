import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        String[] questions = {  "Which of the following is the correct way to declare a variable in Java?",
                                "What is the default value of a boolean variable in Java (if not initialized)?",
                                "Which keyword is used to create a new object in Java?",
                                "Which of the following is a valid main method signature in Java?",
                                "What does the System.out.println() method do?"};
        String[][] options = {  {"A) int num = 10;","B) num int = 10;","C) integer num = 10;","D) var int num = 10;",},
                                {"A) true","B) false","C) 0","D) null",},
                                {"A) make","B) create","C) new","D) build",},
                                {"A) public void main(String args)","B) public static void main(String[] args)","C) static void main(String args[])","D) public static main(String[] args)",},
                                {"A) Reads user input from the keyboard","B) Prints output to the console","C) Creates a new variable","D) Compiles the program",}};
        char[] answers = {'A','B','C','B','B'};
        int score = 0;
        char guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");
        System.out.println();

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for(String option : options[i]) {
                System.out.println(option);
            }
            System.out.println();

            System.out.print("Enter your choice: ");
            guess = scanner.next().charAt(0);

            if(guess == answers[i]) {
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                System.out.println();
                score++;
            }
            else {
                System.out.println("********");
                System.out.println(" WRONG!");
                System.out.println("********");
                System.out.println();
            }
        }
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
