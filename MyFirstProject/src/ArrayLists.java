import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores objects (autoboxing).
        // Arrays are fixed in size, but ArrayLists can change.

        // This ArrayList will store integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        System.out.println();

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);
        fruits.remove(0);
        System.out.println(fruits);
        fruits.set(1, "Kiwi");
        System.out.println(fruits);
        System.out.println(fruits.get(1));
        System.out.println(fruits.size());

        System.out.println();

        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("Carrot");
        veggies.add("Broccoli");
        veggies.add("Celery");
        System.out.println(veggies);
        Collections.sort(veggies);
        System.out.println(veggies);
        for(String veggie: veggies) {
            System.out.println(veggie);
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the # of food you would like: ");
        int numOfFoods = scanner.nextInt(); // Once integer is accepted, the buffer must be cleared since...
        scanner.nextLine(); // there will be a new line character there from pressing enter. This line will clear it.

        for (int i = 1; i <= numOfFoods; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);
        scanner.close();
    }
}
