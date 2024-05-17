package TestCode;

import java.io.File;

public class Separator {
    public static void main(String[] args) {
        String folders = "data" + File.separator + "save";
        System.out.println("Creating folder " + folders);
        File dir = new File(folders);
        System.out.println(dir.getAbsolutePath());
    }
}