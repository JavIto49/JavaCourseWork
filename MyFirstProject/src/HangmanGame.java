import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {

        // JAVA HANGMAN GAME

        String filePath = "/Users/josephvillalobos/Desktop/Github Repos/JavaCourseWork/MyFirstProject/src/HangmanWords.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("I/O Error");
        }

        Random random = new Random();
        // Word is selected by using the array list of words filled from the passed in file. By using random class,
        // the word to get from the array is determined through a range up to the entire size of the array list.
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("WELCOME TO JAVA HANGMAN!");
        System.out.println("************************");

        // Continue the game while guesses available
        while(wrongGuesses < 6) {

            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");

            for(char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);


            if(word.indexOf(guess) >= 0) { // If an occurrence of guess is at index 0 or higher
                System.out.println("You guessed correctly!");
                System.out.println();

                // Cycle through the mystery word, if the current index value is the same as the guess, then set the wordState '_' to the same value as the guess
                for(int i = 0; i < word.length(); i++) {
                    if(word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
                // Winning condition
                if(!wordState.contains('_')) {
                    System.out.print(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + word);
                    break;
                }
            }
            else {
                wrongGuesses++;
                System.out.println("You did not guess correctly!");
            }
        }
        if(wrongGuesses >= 6) {
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }

        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses){

        return switch(wrongGuesses){
            case 0 -> """
                      
                      
                      
                      
                      """;
            case 1 -> """
                       O
                      
                      
                      
                      """;
            case 2 -> """
                       O
                       |
                       |
                      
                      """;
            case 3 -> """
                       O
                     / |
                       |
                     
                     """;
            case 4 -> """
                       O
                     / | \\
                       |
                     
                     """;
            case 5 -> """
                       O
                     / | \\
                       |
                      /
                     """;
            case 6 -> """
                       O
                     / | \\
                       |
                      / \\
                     """;
            default -> "";
        };
    }
}
