package Algoritma_dan_Struktur_Data.Pertemuan1;

import java.util.Scanner;

public class Tugas2 {
    public static int volume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int luasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static int keliling(int sisi) {
        return 12 * sisi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan pilih rumus kubus yang ingin Anda gunakan");
        System.out.println("1. Hitung Volume");
        System.out.println("2. Hitung Luas Permukaan");
        System.out.println("3. Hitung Keliling");
        System.out.print("Pilih Rumus: ");
        int rumus = sc.nextInt();
        switch (rumus) {
            case 1:
                System.out.print("Masukkan sisi: ");
                int sisi = sc.nextInt();
                System.out.println("Volume kubus: " + volume(sisi));
                break;
            case 2:
                System.out.print("Masukkan sisi: ");
                sisi = sc.nextInt();
                System.out.println("Luas Permukaan Kubus: " + luasPermukaan(sisi));
                break;
            case 3:
                System.out.print("Masukkan sisi: ");
                sisi = sc.nextInt();
                System.out.println("Keliling Kusbus: " + keliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}