import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {

    // How to write a file using Java (4 popular options)

    // FileWriter = Good for small or medium-sized text files
    // Buffered Writer = Better performance for large amounts of text
    // PrintWriter = Best for structured data, like reports or logs
    // FileOutputStream = Best for binary files (e.g., images, audio files)

    public static void main (String[] args) {
        // Reading or writing files is unpredictable and can be considered dangerous code. So its good practice to use...
        // try and catch blocks when doing so.
        try (FileWriter writer = new FileWriter("testing.txt")) {
            // Will create a file under the name passed with the content below. The File will appear within the src panel.
            writer.write("Hello World, I like watching movies!");
            System.out.println("File has been successfully written.");
        }
        // If for some reason the file cannot be written, you might encounter an IOException.
        // Specifically, acts as a safety net
        catch (IOException e) {
            System.out.println("Could not write file.");
        }

        // You could also pick a specific location to save your file at by using an absolute path.
        try (FileWriter writer = new FileWriter("/Users/josephvillalobos/Desktop/testingThree.txt")) {
            writer.write("Hello World, this is my second file!\nAdding more text to file...");
            System.out.println("File has been successfully written.");
        }
        // If you mistype the absolute path, it will result in an exception as the location could not be found.
        // If you can't find a file or a path is invalid, this will handle that.
        catch(FileNotFoundException e) {
            System.out.println("Could not locate file location.");
        }
        catch (IOException e) {
            System.out.println("Could not write file.");
        }

        // For better organization, you could place the file path into a String
        String filePath = "/Users/josephvillalobos/Desktop/testingFour.txt";
        // You can also pass in a String into the write method instead of a literal
        String textContent = "The file is being filled with text";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been successfully written.");
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not locate file location.");
        }
        catch (IOException e) {
            System.out.println("Could not write file.");
        }

        // If you have a String that takes up multiple lines, you can write a multi-line String
        String textContentTwo = """
                This text is going to be very long so I am using a multi-line string. That way I am able to adjust for 
                its lengthy and place it within the textContentTwo String. Blah blah blah blah blah blah blah blah blah. 
                """;
    }
}