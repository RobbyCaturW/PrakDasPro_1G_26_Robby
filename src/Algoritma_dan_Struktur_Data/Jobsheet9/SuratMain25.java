package Algoritma_dan_Struktur_Data.Jobsheet9;

import java.util.Scanner;

public class SuratMain25 {
    public static void main(String[] args) {
        StackSurat25 stack = new StackSurat25(5);
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("\n=== DAFTAR MENU ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    String id, nama, kelas;
                    char jenisIzin;
                    int durasi;
                    System.out.print("ID surat: ");
                    id = sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("Jenis izin: ");
                    jenisIzin = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi: ");
                    durasi = sc.nextInt();
                    sc.nextLine();
                    Surat25 surat = new Surat25(id, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("Izin telah disimpan");
                    break;
                case 2:
                    Surat25 verified = stack.pop();
                    if (verified != null) {
                        System.out.println("Memverifikasi ID Surat " + verified.idSurat + " atas nama " + verified.namaMahasiswa);
                        System.out.print("Apakah surat ini valid? (Y/N): ");
                        String valid = sc.nextLine();
                        boolean isValid;
                        if (valid.equalsIgnoreCase("y")) isValid = true;
                        else isValid = false;
                        verified.isValid = isValid;
                        System.out.println("Surat berhasil diverivikasi!\nStatus: " + (isValid ? "Valid" : "Tidak Valid"));
                    }
                    break;
                case 3:
                    Surat25 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir diajukan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String namaDicari = sc.nextLine();
                    int posisi = stack.cari(namaDicari);
                    if (posisi != -1) {
                        System.out.println("=== Surat atas nama " + namaDicari + " ===");
                        stack.print(posisi);
                    } else System.out.println("Surat atas nama " + namaDicari + " tidak ditemukan!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (menu > 0 && menu < 5);
    }
}
