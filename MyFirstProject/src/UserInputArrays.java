import java.util.Scanner;

public class UserInputArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("How many foods do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine(); // Clears out buffer since an int then a nextLine is performed

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter your favorite food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
