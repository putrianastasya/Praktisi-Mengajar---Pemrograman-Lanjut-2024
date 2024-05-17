package LatihanAntrian;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Antrian {
    private ArrayList<String> namaPengunjung;
    private ArrayList<Integer> nomorAntrian;
    private LocalDate tanggal;

    public Antrian() {
        namaPengunjung = new ArrayList<>();
        nomorAntrian = new ArrayList<>();
        tanggal = LocalDate.now();
    }

    public void tambahPengunjung(String nama, int nomor) {
        namaPengunjung.add(nama);
        nomorAntrian.add(nomor);
    }

    public void simpanDataAntrian() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dataAntrian.txt", true))) {
            for (int i = 0; i < namaPengunjung.size(); i++) {
                String nama = namaPengunjung.get(i);
                int nomor = nomorAntrian.get(i);
                writer.write("Nama: " + nama + ", Nomor: " + nomor + ", Tanggal: " + tanggal + "\n");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan data antrian.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Antrian antrian = new Antrian();
        antrian.tambahPengunjung("Putri Anastasya", 1);
        antrian.tambahPengunjung("Ester Purba", 2);
        antrian.tambahPengunjung("Joy ", 3);
        antrian.simpanDataAntrian();
    }
}
