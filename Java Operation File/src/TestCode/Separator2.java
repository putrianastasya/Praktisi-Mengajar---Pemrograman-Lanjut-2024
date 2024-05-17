package TestCode;

import java.io.File;

public class Separator2 {
    public static void main(String[] args) {
        String folders = "data/save"; // Altered line
        System.out.println("Creating folder " + folders);
        File dir = new File(folders);
        System.out.println(dir.getAbsolutePath());
    }
}