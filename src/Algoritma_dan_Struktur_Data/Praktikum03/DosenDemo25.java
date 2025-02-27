package Algoritma_dan_Struktur_Data.Praktikum03;

import java.util.Scanner;

public class DosenDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen25[] arrayOfDosen = new Dosen25[3];
        String kode, nama, jk;
        int usia;
        Boolean jenisKelamin = null;
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();

            System.out.print("Jenis Kelamin : ");
            jk = sc.nextLine();
            if (jk.equalsIgnoreCase("pria")) {
                jenisKelamin = false;
            } else if (jk.equalsIgnoreCase("wanita")) {
                jenisKelamin = true;
            }

            System.out.print("Usia          : ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen25(kode, nama, jenisKelamin, usia);
        }

        DataDosen25.dataSemuaDosen(arrayOfDosen);
        DataDosen25.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen25.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen25.infoDosenPalingTua(arrayOfDosen);
        DataDosen25.infoDosenPalingMuda(arrayOfDosen);
    }
}
