package objectstreamtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("F:\\projects\\DEV2504LM-JAVA35\\Lesson\\Lesson11\\res\\file\\people.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            Person[] people = (Person[]) ois.readObject();
            for (Person p : people) {
                System.out.println(p.toString());
            }
        } finally {
            if (ois != null) {
                ois.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }
}
