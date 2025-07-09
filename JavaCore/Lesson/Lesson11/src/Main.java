import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Khai báo đường dẫn tuyệt đối
        File file = new File("F:\\projects\\DEV2504LM-JAVA35\\Lesson\\Lesson11\\res\\file\\data.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File đã được tạo thành công: " + file.getAbsolutePath());
            } else {
                System.out.println("File đã tồn tại.");
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi tạo file.");
            e.printStackTrace();
        }

        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile());
    }
}
