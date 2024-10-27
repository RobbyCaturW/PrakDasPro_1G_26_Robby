package Pertemuan9;
import java.util.Scanner;

public class Persegi26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        sc.close();
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                if (i == 1 || i == angka || j == 1 || j == angka) {
                    System.out.print(angka + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
