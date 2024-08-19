import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        // Đường dẫn file
        String filePath = "test.txt";

        // Tạo một đối tượng File đại diện cho file "example.txt"
        File file = new File(filePath);

        try {
            // Kiểm tra nếu file đã tồn tại
            if (file.exists()) {
                System.out.println("File đã tồn tại.");
            } else {
                // Tạo file mới nếu nó chưa tồn tại
                if (file.createNewFile()) {
                    System.out.println("File được tạo thành công: " + file.getName());
                } else {
                    System.out.println("Không thể tạo file.");
                }
            }

            // Kiểm tra xem file có phải là thư mục không
            if (file.isDirectory()) {
                System.out.println("Đây là một thư mục.");
            } else {
                System.out.println("Đây không phải là một thư mục.");
            }

            // Hiển thị đường dẫn tuyệt đối của file
            System.out.println("Đường dẫn tuyệt đối: " + file.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi.");
            e.printStackTrace();
        }
    }
}
