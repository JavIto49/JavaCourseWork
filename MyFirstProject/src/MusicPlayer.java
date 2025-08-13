import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {

        // How to PLAY AUDIO with Java (.wav, .au, .aiff)

        String filePath = "/Users/josephvillalobos/Desktop/days-before-rodeo---digital-deluxe-album/10-backyard.wav";
        // Create a file object and pass in the file path
        File file = new File(filePath);

        // Once again when handling files its considered dangerous code due to its unpredictability,
        // so best practice is to use try-catch blocks.
        // First, create an audio input stream object in which you must pass your file to.
        // When using the .getAudioInputStream a catch block is necessary for any UnsupportedAudioFileException.

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            // Take user input to set how long music should play for
            // Try will automatically close the audioStream and scanner once done running. For this to be possible, the
            // object must implement the AutoClosable interface.

            // A clip object is a sound player, it allows you to load an audio file and then play, pause, stop,
            // or reset the audio. Controls is what it essentially is.
            // You also need a catch clause for the .getClip() method, LineUnavailableException. It might occur if another,
            // resource is trying to access the same audio file or if it's unplayable for some other reason.
            Clip clip = AudioSystem.getClip();
            // pass in audioStream object to the clip method so it can open it.
            clip.open(audioStream);

            // To play and control the audio
            String response = "";

            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Select an option: ");
                response = scanner.next().toUpperCase();
                System.out.println();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("INVALID OPTION");
                }
                System.out.println();
            }
        }
        // If we cant locate the audio file
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Thank you for using the music player!");
        }
    }
}