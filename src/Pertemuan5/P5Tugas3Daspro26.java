package Pertemuan5;

import java.util.Scanner;

/**
 * P5Tugas3Daspro26
 */
public class P5Tugas3Daspro26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMakanan;
        int hargaMakanan, jumlahMakanan, hargaSetelahDiskon, jumlahHarga;
        float diskonHarga;
        System.out.print("Masukkan nama makanan: ");
        namaMakanan = sc.nextLine();
        System.out.print("Masukkan harga makanan: ");
        hargaMakanan = sc.nextInt();
        System.out.print("Masukkan jumlah makanan: ");
        jumlahMakanan = sc.nextInt();
        jumlahHarga = hargaMakanan * jumlahMakanan;
        diskonHarga = 0f;
        if (jumlahHarga > 100000 && jumlahHarga <= 200000) {
            diskonHarga = jumlahHarga * 0.02f;
        } else if (jumlahHarga > 200000 && jumlahHarga <= 200000) {
            diskonHarga = jumlahHarga * 0.05f;
        } else if (jumlahHarga > 500000) {
            diskonHarga = jumlahHarga * 0.1f;
        }
        hargaSetelahDiskon = (int) ((int) jumlahHarga - diskonHarga);
        System.out.println("Nama makanan: " + namaMakanan);
        System.out.println("Jumlah makanan: " + jumlahMakanan);
        System.out.println("Harga setelah diskon: " + hargaSetelahDiskon);
    }
}