package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        int[] jmlMhs = new int[n];
        int[] nilaiMhs = new int[n];
        double rata2MhsLulus = 0, rata2MhsTdkLulus = 0, mhsLulus = 0, mhsTdkLulus = 0, nilaiMhsLulus = 0, nilaiMhsTdkLulus = 0;
        for (int i = 0; i < jmlMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                nilaiMhsLulus += nilaiMhs[i];
                mhsLulus += 1;
            } else {
                nilaiMhsTdkLulus += nilaiMhs[i];
                mhsTdkLulus += 1;
            }
        }
        rata2MhsLulus += nilaiMhsLulus/mhsLulus;
        rata2MhsTdkLulus += nilaiMhsTdkLulus/mhsTdkLulus;
        System.out.println("Rata-rata nilai lulus = " + rata2MhsLulus);
        System.out.println("Rata-rata nilai yang tidak lulus = " + rata2MhsTdkLulus);
        
    }
}