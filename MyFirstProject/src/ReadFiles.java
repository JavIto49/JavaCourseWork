import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) {

        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String filePath = "/Users/josephvillalobos/Desktop/testingFour.txt";

        // First create the BufferedReader object
        // You can't create one without passing in a reader object
        // Try will automatically close the reader when the program finishes
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            // We're taking the reader, reading the current line which returns a String that we're assigning
            // to the String variable of line. After reading one line, the reader will point to the next line.
            // If you run out of lines the readLine() method will instead return null.
            // So you want to continue reading while != null
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Output current line
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        // Safety net
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
