import java.io.FileReader;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("test.txt");
            int data = fileReader.read();
                while (data != -1) {
                System.out.print((char) data); // In ký tự vừa đọc
                data = fileReader.read();
            }
            fileReader.close(); // Đóng FileReader


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
