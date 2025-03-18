import java.io.*;
import java.util.Scanner;

public class TextStreamWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            System.out.println("Enter text (type 'exit' to quit and save):");

            String input;
            while (!(input = sc.nextLine()).equalsIgnoreCase("exit")) {
                writer.write(input);
                writer.newLine();
            }

            writer.close();
            System.out.println("Data written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
