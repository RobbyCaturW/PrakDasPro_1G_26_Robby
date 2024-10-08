package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        String member, qris;
        int pilihan_menu, harga;
        double diskon, total_bayar;
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------");
        System.out.print("Masukkan pilihan menu = ");
        pilihan_menu = input26.nextInt();
        input26.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input26.nextLine();
        System.out.print("Apakah Anda ingin membayar menggunakan QRIS (y/n) ? = ");
        qris = input26.nextLine();
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu secara benar");
                return;
            }
            // Menghitung total bayar
            total_bayar = harga - (harga * diskon);
            if (qris.equalsIgnoreCase("y")) {
                total_bayar -= 1000;
                System.out.println("Bonus diskon bayar menggunakan QRIS = Rp1.000");
            }
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu secara benar");
                return;
            }
            if (qris.equalsIgnoreCase("y")) {
                harga -= 1000;
                System.out.println("Bonus diskon bayar menggunakan QRIS = Rp1.000");
            }
            // Menghitung total bayar

            System.out.println("Total bayar = " + harga);
        }
    }
}
