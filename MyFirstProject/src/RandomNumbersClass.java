import java.util.Random;

public class RandomNumbersClass {
    public static void main(String[] args) {
        // RANDOM NUMBERS CLASS
        Random rand = new Random();

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
        }
    }
}
