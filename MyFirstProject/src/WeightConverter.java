import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight / 2.205;
            System.out.printf("Your weight is: %.2f kgs", newWeight);
        }
        else if(choice == 2) {
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.205;
            System.out.printf("Your weight is: %.2f lbs", newWeight);
        }
        else{
            System.out.println("Invalid option!");
        }

        scanner.close();
    }
}
