package Algoritma_dan_Struktur_Data.Pertemuan1;

import java.util.Scanner;

public class IPSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("====================");
        String[] mk = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Kesehatan dan Keselamatan Kerja"};
        int[] nilai = new int[mk.length];
        int[] SKS = {2, 2, 2, 3, 2, 2, 3, 2};
        String[] bobotHuruf = new String[mk.length];
        double[] bobotNilai = new double[mk.length];
        int jmlSKS = 0;
        for (int i = 0; i < SKS.length; i++) {
            jmlSKS += SKS[i];
        }
        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan nilai untuk MK " + mk[i] + ": ");
            nilai[i] = sc.nextInt();
        }
        System.out.println("====================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf("%-40s %-15s %-15s %-15s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= 80 && nilai[i] <= 100) {
                bobotHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilai[i] >= 73 && nilai[i] < 80) {
                bobotHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilai[i] >= 65 && nilai[i] < 73) {
                bobotHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilai[i] >= 60 && nilai[i] < 65) {
                bobotHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilai[i] >= 50 && nilai[i] < 60) {
                bobotHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilai[i] >= 39 && nilai[i] < 50){
                bobotHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                bobotHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
            System.out.printf("%-40s %-15.1f %-15s %-15.1f%n", mk[i], ((double) (nilai[i])), bobotHuruf[i], bobotNilai[i]);
        }
        double jmlBobot = 0;
        for (int i = 0; i < bobotNilai.length; i++) {
            jmlBobot += bobotNilai[i] * SKS[i];
        }
        double total = jmlBobot / jmlSKS;
        System.out.println("====================");
        System.out.printf("IP: %.2f", total);
    }
}