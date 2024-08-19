import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.printf("Nhập đường dẫn file:   ");
            Scanner scanner = new Scanner(System.in);
            String Path = scanner.nextLine();
            ReadFileExample readFileExample = new ReadFileExample();
            readFileExample.readFileText(Path);
        }
    }
