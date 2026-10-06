import java.io.*;
public class FileOperations {
    public static void main(String[] args) {
        try {
            // Open file for writing
            FileOutputStream out = new FileOutputStream("sample.txt");
            // Write data to file
            String text = "Hello Java File Operations";
            out.write(text.getBytes());
            // Close output stream
            out.close();
            // Open file for reading
            FileInputStream in = new FileInputStream("sample.txt");
            // Read data from file
            int ch;
            System.out.println("File Content:");
            while ((ch = in.read()) != -1) {
                System.out.print((char) ch);
            }
            // Close input stream
            in.close();
        } catch (IOException e) {
            System.out.println("File operation error: " + e);
        }
    }
}