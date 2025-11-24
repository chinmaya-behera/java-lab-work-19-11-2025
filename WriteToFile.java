import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             FileWriter writer = new FileWriter("newfile.txt")) {
            
            System.out.println("Enter text to write to file:");
            writer.write(sc.nextLine());
            System.out.println("Successfully wrote to the file.");
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}