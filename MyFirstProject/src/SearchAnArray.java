import java.util.Scanner;

public class SearchAnArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,5,8,10,14,19,20};
        boolean isFound = false;
        int target;

        System.out.print("Enter the number to be searched: ");
        target = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break; // Once target is found it breaks the loop, avoiding looping through the rest of the array
            }
        }
        if (!isFound) {
            System.out.println("Element not found!");
        }

        System.out.println();

        String[] fruits = {"Apple", "Banana", "Orange", "Strawberry"};
        String targetTwo;
        boolean isFoundTwo = false;

        System.out.print("Enter the fruit to be searched: ");
        targetTwo = scanner.next();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(targetTwo)) { // Because strings are reference data types you cannot compare directly
                // like an int as you'd be comparing memory addresses not the string value
                System.out.println("Element found at index: " + i);
                isFoundTwo = true;
                break;
            }
        }
        if (!isFoundTwo) {
            System.out.println("Element not found!");
        }

        scanner.close();
    }
}
