package Algoritma_dan_Struktur_Data.Praktikum03;

import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah25[] arrayOfMataKuliah = new MataKuliah25[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah25("", "", 0, 0);
            arrayOfMataKuliah[i].tambahData(sc);
        }
    }
}
