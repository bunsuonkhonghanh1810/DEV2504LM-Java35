package bytestreamtest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamApp {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("F:\\projects\\DEV2504LM-JAVA35\\Lesson\\Lesson11\\res\\file\\hello.txt");
            fos = new FileOutputStream("F:\\projects\\DEV2504LM-JAVA35\\Lesson\\Lesson11\\res\\file\\outagain.txt");
            int ch;

            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}
