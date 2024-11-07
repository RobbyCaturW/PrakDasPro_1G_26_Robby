package Pertemuan10;

import java.util.Scanner;

public class Tugas226 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Masukkan jumlah pesanan: ");
           int jmlPesanan = sc.nextInt();
           sc.nextLine();
           String[] menu = new String[jmlPesanan];
           int[] harga = new int[jmlPesanan];
           int totalHarga = 0;
           for (int i = 0; i < menu.length; i++) {
                System.out.print("Masukkan nama makanan/minuman ke-" + (i+1) + ": ");
                menu[i] = sc.nextLine();
           }
           for (int i = 0; i < harga.length; i++) {
                System.out.print("Masukkan harga makanan/minuman ke-" + (i+1) + ": ");
                harga[i] = sc.nextInt();
                totalHarga += harga[i];
           }
           for (int i = 0; i < jmlPesanan; i++) {
               System.out.println("Nama pesanan: "+ menu[i]);
               System.out.println("Harga:" + harga[i]);
           }
           System.out.println("Total Harga: " + totalHarga);
    }
}
