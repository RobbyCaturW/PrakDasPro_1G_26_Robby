package Pertemuan11;

import java.util.Scanner;

public class SIAKAD26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMhs, jmlMatkul;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        jmlMatkul = sc.nextInt();
        int[][] nilai = new int[jmlMhs][jmlMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/jmlMatkul);
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");
        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul/jmlMhs);
        }
    }
}
