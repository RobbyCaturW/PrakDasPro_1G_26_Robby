package Pertemuan10;

import java.util.Scanner;

public class Tugas126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rata = 0, tertinggi = 0, terendah = 100;
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        int[] jmlMhs = new int[n];
        double[] nilaiMhs = new double[n];
        double nilai = 0;

        for (int i = 0; i < jmlMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] += sc.nextDouble();
            nilai += nilaiMhs[i];
        }
        rata += nilai/nilaiMhs.length;
        System.out.println();
        System.out.println("Rata-rata nilai = " + rata);
        nilai = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            nilai = nilaiMhs[i];
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println();
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + i + " = " + nilaiMhs[i]);
        }
    }
}
