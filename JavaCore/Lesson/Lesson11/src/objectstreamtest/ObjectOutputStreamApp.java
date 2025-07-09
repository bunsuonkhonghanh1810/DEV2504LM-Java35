package objectstreamtest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person(1, "John Doe");
        Person p2 = new Person(2, "Jane Doe");

        Person[] people = {p1, p2};

        FileOutputStream fos = new FileOutputStream("F:\\projects\\DEV2504LM-JAVA35\\Lesson\\Lesson11\\res\\file\\people.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try {
            oos.writeObject(people);
        } finally {
            if (oos != null) {
                oos.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}
