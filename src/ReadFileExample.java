import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        int totalSum = 0;

        try {
            // Đọc file theo đường dẫn
            File file = new File(filePath);

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException("File không tồn tại: " + filePath);
            }

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";

            while ((line = br.readLine()) != null) {
                try {
                    // Cố gắng chuyển đổi dòng thành số nguyên và cộng vào tổng
                    int number = Integer.parseInt(line.trim());
                    totalSum += number;
                } catch (NumberFormatException e) {
                    // Nếu dòng không thể chuyển đổi thành số nguyên, hiển thị thông báo
                    System.err.println("Dòng không phải là số nguyên hợp lệ: " + line);
                }
            }
            br.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + totalSum);
        } catch (FileNotFoundException e) {
            // TH file không tồn tại
            System.err.println("File không tồn tại: " + e.getMessage());
        } catch (IOException e) {
            // TH có lỗi khi đọc file
            System.err.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
    }


}
