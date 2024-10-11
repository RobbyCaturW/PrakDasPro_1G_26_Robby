package Pertemuan7;

import java.util.Scanner;

public class Parkir26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, hargaParkir = 0, hargaTotal = 0, jmlHarga = 0;
        do {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk keluar): ");
            jenis = sc.nextInt();
            if  (jenis == 0) {
                System.out.println("Keluar");
                break;
            } else {
                if (jenis == 1) {
                    System.out.print("Masukkan durasi parkir: ");
                    durasi = sc.nextInt();
                    hargaParkir = 3000;
                    if (durasi > 5) hargaTotal = 12500;
                    else if (durasi > 0 && durasi <= 5) hargaTotal += hargaParkir * durasi;
                }
                if (jenis == 2) {
                    System.out.print("Masukkan durasi parkir: ");
                    durasi = sc.nextInt();
                    hargaParkir = 2000;
                    if (durasi > 5) hargaParkir = 12500;
                    else if (durasi > 0 && durasi <5) hargaTotal += hargaParkir * durasi;
                }
                jmlHarga += hargaTotal;
                System.out.println("Total yang harus dibayar: Rp " + jmlHarga);
                sc.nextLine();
            }
        } while (true);
    }
}
