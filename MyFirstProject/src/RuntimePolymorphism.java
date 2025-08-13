import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args) {

        // Runtime polymorphism = when the method that gets executed
        // is decided at runtime based on the actual type of the object

        Scanner scanner = new Scanner(System.in);

        // Instrument is declared but not assigned depending on user selection of a specific instrument
        Instrument instrument;

        System.out.print("Do you want to play the guitar or drums? (1 = guitar, 2 = drums): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            instrument = new Guitar();
            instrument.play();
        }
        else if (choice == 2) {
            instrument = new Drums();
            instrument.play();
        }

        // The actual method called is determined at runtime after the program has started to run

        scanner.close();
    }
}
