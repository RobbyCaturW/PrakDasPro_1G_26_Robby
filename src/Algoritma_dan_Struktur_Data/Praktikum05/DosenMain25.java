package Algoritma_dan_Struktur_Data.Praktikum05;

import java.util.Scanner;

public class DosenMain25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen25 data = new DataDosen25();
        boolean isRunning = true;
        while (isRunning) { 
            System.out.println("===== MENU DOSEN =====");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampilkan data");
            System.out.println("3. Sorting ASC menggunakan bubble sort");
            System.out.println("4. Sorting DSC menggunakan selection sort");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    for (int i = 0; i < data.dataDosen.length; i++) {
                        System.out.println("Input data dosen ke-" + (i+1));
                        String nama, kode;
                        boolean jenisKelamin = true;
                        int usia;
                        System.out.print("Kode: ");
                        kode = sc.nextLine();
                        System.out.print("Nama: ");
                        nama = sc.nextLine();
                        System.out.print("Jenis Kelamin (Pria/Wanita): ");
                        String jk = sc.nextLine();
                        if (jk.equalsIgnoreCase("Pria")) jenisKelamin = true;
                        else if (jk.equalsIgnoreCase("Wanita")) jenisKelamin = false;
                        System.out.print("Usia: ");
                        usia = sc.nextInt();
                        sc.nextLine();

                        Dosen25 dsn = new Dosen25(kode, nama, jenisKelamin, usia);
                        data.tambah(dsn);
                    }
                    break;
                case 2:
                    System.out.println("Data Seluruh Dosen: ");
                    data.tampil();
                    break;
                case 3:
                    System.out.println("Data Dosen setelah diurutkan menggunakan BUBBLE SORT (ASC)");
                    data.SortingASC();
                    data.tampil();
                    break;
                case 4:
                    System.out.println("Data Dosen setelah diurutkan menggunakan SELECTION SORT (DSC)");
                    data.sortingDSC();
                    data.tampil();
                    break;
                case 5:
                    System.out.println("Selesai!");
                    isRunning = false;
                    break;
            
                default:
                    break;
            }
        }
    }
}
