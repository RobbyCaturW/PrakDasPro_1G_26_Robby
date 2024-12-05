package Pertemuan13;
import java.util.Scanner;

public class Tugas2 {
    static int[][] penjualan = {
        {20, 20, 20, 25, 10, 10, 5},  // Kopi
        {30, 80, 40, 10, 10, 10, 25}, // Teh
        {5, 8, 9, 12, 15, 20, 25},    // Es Degan
        {50, 10, 17, 20, 10, 15, 0},  // Roti Bakar
        {15, 15, 16, 10, 10, 10, 55}  // Gorengan
    };

    static String[] menu = {"Kopi\t", "Teh\t", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void tampilkanData() {
        System.out.print("\t\t");
        for (int i = 1; i <= 7; i++) {
            System.out.print("| Hari ke" + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print("| " + penjualan[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void editData(Scanner sc) {
        System.out.println("\n=== Edit Data Penjualan ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.print("Pilih menu (1-5): ");
        int pilihanMenu = sc.nextInt() - 1;

        if (pilihanMenu >= menu.length) {
            System.out.println("Menu tidak valid!");
            return;
        }

        System.out.print("Masukkan hari (1-7): ");
        int hari = sc.nextInt() - 1;

        if (hari >= 7) {
            System.out.println("Hari tidak valid!");
            return;
        }

        System.out.print("Masukkan nilai baru: ");
        int nilai = sc.nextInt();

        penjualan[pilihanMenu][hari] = nilai;
        System.out.println("Data berhasil diperbarui!");
    }

    public static void penjualanTertinggi() {
        System.out.println("\n=== Menu dengan Penjualan Tertinggi ===");
        int penjualanTertinggi = 0;
        String menuTertinggi = "";

        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > penjualanTertinggi) {
                penjualanTertinggi = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi: " + menuTertinggi);
        System.out.println("Total penjualan: " + penjualanTertinggi);
    }

    public static void rataPenjualan() {
        System.out.println("\n=== Rata-rata Penjualan ===");
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rata = (double) totalPenjualan / 7;
            System.out.println(menu[i] + "\t: " + rata);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Mariana Cafe ===");
            System.out.println("0. Keluar");
            System.out.println("1. Tampilkan Seluruh Data Penjualan");
            System.out.println("2. Edit Data Penjualan");
            System.out.println("3. Tampilkan Menu dengan Penjualan Tertinggi");
            System.out.println("4. Tampilkan Rata-rata Penjualan");
            System.out.print("Pilih opsi: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanData();
                    break;
                case 2:
                    editData(sc);
                    break;
                case 3:
                    penjualanTertinggi();
                    break;
                case 4:
                    rataPenjualan();
                    break;
                case 0:
                    System.out.println("Selesai");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
