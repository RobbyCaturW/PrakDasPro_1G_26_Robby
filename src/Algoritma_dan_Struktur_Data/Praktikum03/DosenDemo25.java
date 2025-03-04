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
        
        int count = 1;
        for (Dosen25 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + count);
            System.out.println("Kode            : " + d.kode);
            System.out.println("Nama            : " + d.nama);
            System.out.println("Jenis Kelamin   : " + (d.jenisKelamin == true ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + d.usia);
            System.out.println("------------------------------");
            count++;
        }
        
    }
}