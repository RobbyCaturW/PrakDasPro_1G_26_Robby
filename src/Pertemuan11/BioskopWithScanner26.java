package Pertemuan11;

import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, select;
        String nama, next;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("Pilih salah satu dari menu berikut");
            System.out.println("1. Input nama penonton");
            System.out.println("2. Tampilkan nama penonton");
            System.out.println("3. Exit");
            System.out.print("Input Menu: ");
            select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1:
                    do {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        penonton[baris-1][kolom-1] = nama;
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();
                    } while (next.equalsIgnoreCase("y"));
                    break;
                case 2:
                    for (String[] a : penonton) {
                        System.out.println(String.join(", ", a));
                    }
                    break;
                case 3:
                    System.out.println("Done");
                    return;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}
