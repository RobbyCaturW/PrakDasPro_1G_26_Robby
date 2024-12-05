package Pertemuan13;
import java.util.Scanner;

public class Tugas3 {
    static int[][] penjualan;
    static String[] menu;
    // bagian yang dimodifikasi: menambahkan static jumlah menu dan penjualan
    static int jmlMenu;
    static int jmlHari;

    public static void tampilkanData() {
        System.out.print("\t");
        // Mengubah agar lebih dinamis
        for (int i = 0; i < penjualan[0].length; i++) {
            System.out.print("| Hari ke" + (i + 1) + "\t");
        }
        System.out.println();
        // mengganti menu ke penjualan agar lebih sesuai
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i] + "\t");
            // ganti angka 7 menjadi pujualan[i].length agar lebih dinamis
            for (int j = 0; j < penjualan[i].length; j++) {
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
        // buat agar infinite loop
        while (true) { 
            System.out.println("\nInput angka 0 untuk keluar menghentikan perubahan");
            // ganti menjadi menu.length agar lebih dinamis
            System.out.print("Pilih menu (1-" + menu.length + "): ");
            int pilihanMenu = sc.nextInt() - 1;
            if (pilihanMenu < 0) break;
    
            if (pilihanMenu >= menu.length) {
                System.out.println("Menu tidak valid!");
                return;
            }
            // ganti menjadi penjualan[0].length agar lebih dinamis
            System.out.print("Masukkan hari (1-" + penjualan[0].length + "): ");
            int hari = sc.nextInt() - 1;
            if (hari < 0) break;
            // ganti menjadi penjualan[0].length agar lebih dinamis
            if (hari >= penjualan[0].length) {
                System.out.println("Hari tidak valid!");
                return;
            }
    
            System.out.print("Masukkan nilai baru: ");
            int nilai = sc.nextInt();
            if (nilai < 0) break;
            penjualan[pilihanMenu][hari] = nilai;
            System.out.println("Data berhasil diperbarui!");
        }
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
            // ganti menjadi penjualan[i].length agar lebih dinamis
            double rata = (double) totalPenjualan / penjualan[i].length;
            System.out.println(menu[i] + "\t: " + rata);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // menambahkan code untuk menerima jumlah menu dan hari berdasarkan input
        System.out.print("Masukkan jumlah menu: ");
        jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        jmlHari = sc.nextInt();
        System.out.println();
        // inisialisasi array
        penjualan = new int[jmlMenu][jmlHari];
        menu = new String[jmlMenu];
        // tambahkan sc.nextLLine()
        sc.nextLine();
        // meminta input untuk mengisi nama menu
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == null) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                menu[i] = sc.nextLine();
            }
        }
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