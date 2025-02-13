package Algoritma_dan_Struktur_Data.Pertemuan1;

import java.util.Scanner;

public class deretBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();
        System.out.println("====================");
        int bilangan = (int) (nim % 100) + 10;
        System.out.println("n: " + bilangan);
        for (int i = 1; i <= bilangan; i++) {
            String hasil = "*";
            if (i == 6 || i == 10) {
                continue;
            }
            System.out.print(i % 2 == 0 ? i : hasil);
        }
    }
}
