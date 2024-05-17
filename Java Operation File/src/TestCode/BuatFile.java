package TestCode;

import java.io.File;

public class BuatFile {
 public static void main(String args[]) {
 File file1=new File("ContohFile1.txt");
 System.out.println(file1.getAbsolutePath());
 System.out.println(file1.exists());
 }
}
