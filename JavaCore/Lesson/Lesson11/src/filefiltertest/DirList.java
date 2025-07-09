package filefiltertest;

import java.io.File;
import java.io.FilenameFilter;

public class DirList {
    public static void main(String[] args) {
        String dirName = "F:\\projects\\NCKH";
        File fileObj = new File(dirName);
        FilenameFilter filenameFilter = new FileFilter("py");
        String[] files = fileObj.list(filenameFilter);
        System.out.println("Number of files in directory: " + files.length);
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
