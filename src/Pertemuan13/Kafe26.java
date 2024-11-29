package Pertemuan13;

import java.util.Scanner;
public class Kafe26 {
    static void Menu(String namaPelanggan) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        // if (isMember) {
        //     System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        // }
        // switch (kodePromo.toUpperCase()) {
        //     case "DISKON50":
        //         System.out.println("Berikan diskon 50%");
        //         break;
        //     case "DISKON30":
        //         System.out.println("Berikan diskon 30%");
        //         break;
        //     default:
        //         System.out.println("Kode invalid");
        //         break;
        // }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHarga26 (int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diskon = 0;
        String kodePromo;
        Menu("Andi");
        int pilihanMenu, banyakItem, harga = 0;
        while (true) {
            System.out.print("Masukkan nomor menu yang ingin anda pesan (ketik 0 untuk keluar): ");
            pilihanMenu = sc.nextInt();
            if (pilihanMenu == 0) break;
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            banyakItem = sc.nextInt();
            harga += hitungTotalHarga26(pilihanMenu, banyakItem);
        }
        sc.nextLine();
        System.out.print("Apakah Anda memiliki kode promo? (y/n) : ");
        String promo = sc.nextLine();
        if (promo.equalsIgnoreCase("y")) {
            System.out.print("Masukkan kode promo: ");
            kodePromo = sc.nextLine();
            switch (kodePromo.toUpperCase()) {
                case "DISKON30":
                    diskon = 0.3;
                    break;
                case "DISKON50":
                    diskon = 0.5;
                    break;
                case "":
                    diskon = 0;
                    break;
                default:
                    System.out.println("Invalid kode");
                    break;
            }
        }
        int totalHarga = (int) (harga - (harga * diskon));
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}