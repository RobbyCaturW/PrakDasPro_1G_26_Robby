package Algoritma_dan_Struktur_Data.Praktikum03;

import java.util.Scanner;

public class DosenDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int n = sc.nextInt();
        sc.nextLine();
        Dosen25[] arrayOfDosen = new Dosen25[n];
        String kode, nama, jk;
        int usia;
        Boolean jenisKelamin = null;
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jk = sc.nextLine();
            if (jk.equalsIgnoreCase("pria")) {
                jenisKelamin = true;
            } else if (jk.equalsIgnoreCase("wanita")) {
                jenisKelamin = false;
            }
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------");
            arrayOfDosen[i] = new Dosen25(kode, nama, jenisKelamin, usia);
        }
        DataDosen25 dsn = new DataDosen25();
        dsn.dataSemuaDosen(arrayOfDosen);
        dsn.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dsn.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dsn.infoDosenPalingTua(arrayOfDosen);
        dsn.infoDosenPalingMuda(arrayOfDosen);
    }
}