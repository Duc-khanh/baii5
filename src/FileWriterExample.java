
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("Hello!\n");
            writer.write("Tôi tên là ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


