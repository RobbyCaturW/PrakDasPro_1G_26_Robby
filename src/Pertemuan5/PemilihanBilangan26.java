package Pertemuan5;

import java.util.Scanner;

/**
 * PemilihanBilangan26
 */
public class PemilihanBilangan26 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        String hasil = (angka % 2 == 0) ? "Angka " + angka + " termasuk bilangan genap" : "Angka " + angka + " termasuk bilangan ganjil";
        System.out.println((hasil));
    }
}