package Algoritma_dan_Struktur_Data.Kuis1;

import java.util.Scanner;

public class BioskopMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Tambahkan Daftar Film, Rating, dan Harga Tiket Bioskop =====");
        System.out.print("Masukkan jumlah film: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();
        
        Bioskop[] arrayOfBioskop = new Bioskop[n];

        for (int i = 0; i < n; i++) {
            String film;
            double rating;
            int hargaTiket;

            System.out.print("Masukkan Judul Film ke-" + (i+1) + ": ");
            film = sc.nextLine();
            System.out.print("Masukkan rating Film ke-" + (i+1) + ": ");
            rating = sc.nextDouble();
            System.out.print("Masukkan harga tiket ke-" + (i+1) + ": ");
            hargaTiket = sc.nextInt();
            sc.nextLine();
            System.out.println("==========================");
            arrayOfBioskop[i] = new Bioskop(film, rating, hargaTiket);
        }

        boolean isRunning = true;
        while (isRunning) {
            Bioskop bioskop = new Bioskop();

            int menu;
            System.out.println("\n\n===== Menu Bioskop VGC =====");
            System.out.println("1. Tampilkan Jadwal Film");
            System.out.println("2. Tampilkan Rating Tertinggi");
            System.out.println("3. Tampilkan Harga Tiket Termurah");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    bioskop.tampilkanJadwalFilm(arrayOfBioskop);
                    break;
                case 2: 
                    bioskop.tampilkanRatingTertinggi(arrayOfBioskop);
                    break;
                case 3:
                    bioskop.tampilkanTiketTermurah(arrayOfBioskop);
                    break;
                case 4:
                    System.out.println("Selesai. Terima Kasih!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Menu tidak valid!");
                    break;
            }
        }
    }
}
