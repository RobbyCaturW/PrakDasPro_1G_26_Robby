package Pertemuan7;

import java.util.Scanner;

public class Bioskop26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000, jmlPelanggan, jmlTiket, harga, tiket = 0;
        double jmlHarga = 0;
        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        jmlPelanggan = sc.nextInt();
        for (int i = 1; i <= jmlPelanggan; i++) {
            System.out.print("Masukkan jumlah pembelian tiket pelanggan ke-" + i + ": ");
            jmlTiket  =  sc.nextInt();
            harga = hargaTiket * jmlTiket;
            if (jmlTiket < 0) {
                System.out.print("Jumlah pembelian tiket tidak valid. Silahkan melakukan input ulang: ");
                jmlTiket += sc.nextInt();
            }
            if (jmlTiket > 4 && jmlTiket <= 10) {
                jmlHarga += harga - (harga * 0.10);
            } else if (jmlTiket > 10) {
                jmlHarga += harga - (harga * 0.15);
            } else jmlHarga += harga;
            tiket += jmlTiket;
        } 
        System.out.println("Jumlah tiket yang terjual: " + tiket);
        System.out.println("Total harga penjualan tiket: " + jmlHarga);
    }    
}
