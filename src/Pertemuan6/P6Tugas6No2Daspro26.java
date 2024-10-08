package Pertemuan6;

import java.util.Scanner;

public class P6Tugas6No2Daspro26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;
        System.out.print("Masukkan Jenis Buku: ");
        jenisBuku = input.nextLine();
        System.out.print("Masukkan Jumlah Buku: ");
        jumlahBuku = input.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) System.out.println("Jumlah diskon = 12%");
            else System.out.println("Jumlah diskon - 10%");
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) System.out.println("Junlahh diskon = 9%");
            else System.out.println("Jumlah diskon = 8%");
        } else {
            if (jumlahBuku > 3) System.out.println("Jumlah diskon = 5%");
            else System.out.println("Jullah diskon 0%");
        }
    }
}
