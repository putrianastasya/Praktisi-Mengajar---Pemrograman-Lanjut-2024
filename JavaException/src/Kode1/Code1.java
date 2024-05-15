package Kode1;

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0; // Inisialisasi num1 di luar blok try-catch
        try {
            System.out.print("Masukkan angka pertama: ");
            num1 = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int num2 = scanner.nextInt();

            int result = divide(num1, num2);

            // Menampilkan pembagian dan hasilnya
            System.out.println("Pembagian: " + num1 + " / " + num2);
            System.out.println("Hasil pembagian: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());

            // Memanggil metode handleInvalidInput untuk mendapatkan angka baru
            int newNum2 = handleInvalidInput();

            // Mencoba lagi melakukan pembagian dengan angka yang baru dimasukkan
            int result = divide(num1, newNum2);
            System.out.println("Pembagian: " + num1 + " / " + newNum2);
            System.out.println("Hasil pembagian dengan angka baru: " + result);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int handleInvalidInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anda memasukkan angka kedua sebagai 0. Masukkan angka baru: ");
        int newNum2 = scanner.nextInt();

        System.out.println("Percobaan pembagian kembali dengan angka baru: " + newNum2);

        return newNum2;
    }
    
    
}
