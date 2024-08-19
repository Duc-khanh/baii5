import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

    // Phương thức đọc dữ liệu từ file và trả về chuỗi chứa dữ liệu đọc được
    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (FileReader fileReader = new FileReader(filePath)) {
            int data;
            while ((data = fileReader.read()) != -1) {
                content.append((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    // Phương thức ghi dữ liệu vào file và trả về true nếu ghi thành công, ngược lại trả về false
    public static boolean writeFile(String filePath, String data) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(data);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        String filePath = "test.txt";

        // Ghi dữ liệu vào file
        boolean isWritten = writeFile(filePath, "Hello, this is a test.");
        if (isWritten) {
            System.out.println("Dữ liệu đã được ghi vào file thành công.");
        } else {
            System.out.println("Ghi dữ liệu vào file thất bại.");
        }

        // Đọc dữ liệu từ file
        String fileContent = readFile(filePath);
        System.out.println("Nội dung file: " + fileContent);
    }
}

