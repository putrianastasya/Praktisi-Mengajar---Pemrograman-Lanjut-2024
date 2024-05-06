import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RumahSakit {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int urutan = 2;
        boolean exit = false;

        while (!exit) {
             
        System.out.println("Menu : ");
        System.out.println("1. Tambahkan Daftar Pasien");
        System.out.println("2. Tampilkan Daftar Pasien");
        System.out.println("3. Keluar");
        System.out.print("Masukkan Pilihan Anda : ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        switch (pilihan) {
            case 1:
            System.out.println("Masukkan Nama Pasien (Ketik 'selesai' untuk mengakhiri)");
            System.out.print("Nama pasien ke - 1 : ");
            String input = scanner.nextLine();
            while (!input.equalsIgnoreCase("selesai")) {
                antrian.add(input);
                System.out.print("Nama pasien ke - " + urutan + " : ");
                input = scanner.nextLine();
                urutan++;
            }
            System.out.println();
                break;
            case 2:
            System.out.println("Daftar Pasien");
            int noDaftar = 1;
            for (String pasien : antrian) {
                System.out.println(noDaftar + ". " + pasien);
                noDaftar++;
            }    
            System.out.println();
                break;

            case 3:
            exit = true;
            break;
            default:
            System.out.println("Pilihan Tidak valid");
                break;
        }

       
        }
        
       

        
        scanner.close();
    }
}