package Algoritma_dan_Struktur_Data.Praktikum03;

import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        MataKuliah25[] arrayOfMataKuliah = new MataKuliah25[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah25("", "", 0, 0);
            arrayOfMataKuliah[i].tambahData(sc);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-----------------------------");
        }
    }
}
