package Algoritma_dan_Struktur_Data.Pertemuan1;
import java.util.Scanner;
public class nilaiAkhir {

    public static void main(String[] args) {
        double nilaiTugas = 0.2, nilaiKuis = 0.2, nilaiUTS = 0.3, nilaiUAS = 0.3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("====================");
        System.out.print("Masukkan nilai tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int uas = sc.nextInt();
        System.out.println("====================");
        System.out.println("====================");
        if ((tugas < 0 || kuis < 0 || uts < 0 || uas < 0) || (tugas > 100 || kuis > 100 || uts > 100 || uas > 100)) {
            System.out.println("nilai tidak valid");
            System.out.println("====================");
            System.out.println("====================");
        } else {
            double nilaiAkhir = (tugas * nilaiTugas) + (kuis * nilaiKuis) + (uts * nilaiUTS) + (uas * nilaiUAS);
            System.out.println("Nilai akhir: " + nilaiAkhir);
            if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
                System.out.println("Grade: A");
            } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
                System.out.println("Grade: B+");
            } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
                System.out.println("Grade: B");
            } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
                System.out.println("Grade: C+");
            } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
                System.out.println("Grade: C");
            } else if (nilaiAkhir >= 39 && nilaiAkhir < 50){
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: E");
            }
            System.out.println("====================");
            System.out.println("====================");
            System.out.println("SELAMAT ANDA LULUS");
        }
    }
}