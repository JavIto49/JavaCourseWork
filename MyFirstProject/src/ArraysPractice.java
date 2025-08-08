import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        // array = a collection of values of the same data type
        // think of it as a variable that can store more than 1 value

        // This call to the array results in a memory address
        String[] fruits = {"apple", "orange", "banana"};
        System.out.println(fruits);

        // To display actual values you need to access the element of the array at it's index
        String[] veggies = {"carrot", "corn", "celery"};
        System.out.println(veggies[0]);
        System.out.println();

        // Changing an element of an array
        veggies[0] = "cauliflower";
        System.out.println(veggies[0]);
        System.out.println();

        // Getting length of an array
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);
        System.out.println();

        // Print all the elements of an array
        for(int i = 0; i < veggies.length; i++) {
            System.out.print(veggies[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Enhanced for loop or a "for each loop" can also be used to iterate through an array,
        // it specifically cycles once for each element within an array
        for(String fruit : fruits) {
            System.out.println("I like to eat: " + fruit);
        }

        // Sorting an array built in method
        // If Strings they are sorted alphabetically
        // If int they are sorted in ascending order
        System.out.println();
        Arrays.sort(fruits);
        System.out.println("Sorted alphabetically the fruit array looks like this:");
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        }

        // Fill method for arrays, let's you fill in all the elements of an array with a given value
        System.out.println();
        System.out.println();
        Arrays.fill(fruits,"pineapple");
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}