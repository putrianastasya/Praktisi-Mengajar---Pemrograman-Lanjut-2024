package TestCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileStream {

    public static void main(String[] args) {
        int kar;
        try (FileInputStream fileIn = new FileInputStream("src\\TestCode\\teks.txt");
             FileOutputStream fileOut = new FileOutputStream("src\\TestCode\\output.txt")) {

            while ((kar = fileIn.read()) != -1) {
                fileOut.write(kar);
                System.out.print((char) kar);
            }

        } catch (IOException e) {
            System.out.println("File Tidak Ada");
            System.out.println("");
        }

        System.out.println();
        
          try {
            File f = new File("src\\TestCode\\teks.txt");
            FileReader reader = new FileReader(f);
            BufferedReader buff = new BufferedReader(reader);

            String x = buff.readLine();
            while (x != null) {
                System.out.println(x);
                x = buff.readLine();
            }

            buff.close();
            reader.close();

        } catch (IOException e) {
            System.out.println("File Tidak Ada");
        }


    }
}
