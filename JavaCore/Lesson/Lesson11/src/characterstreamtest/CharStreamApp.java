package characterstreamtest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamApp {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("F:\\projects\\DEV2504LM-JAVA35\\Lesson\\Lesson11\\res\\file\\hello.txt");
            fw = new FileWriter("F:\\projects\\DEV2504LM-JAVA35\\Lesson\\Lesson11\\res\\file\\outagain.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
        } finally {
            if (fr != null) {
                fr.close();
            }
            if (fw != null) {
                fw.close(); // BẮT BUỘC để đảm bảo ghi xong dữ liệu
            }
        }
    }
}
