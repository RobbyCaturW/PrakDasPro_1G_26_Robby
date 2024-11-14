package Pertemuan11;

import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris = -1, kolom, select;
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
                        do {
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            if (baris < 1 || baris > 4) baris = -1;
                            if (baris < 0) System.out.println("Baris tidak tersedia! Silahkan input ulang");
                        } while (baris < 1 || baris > 4);
                        do {
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            if (kolom < 1 || kolom > 2) kolom = -1;
                            if (kolom < 0) System.out.println("Kolom tidak tersedia! Silahkan input ulang");
                            sc.nextLine();
                        } while (kolom < 1 || kolom > 2);
                        
                        if (penonton[baris-1][kolom-1] == null) {
                            penonton[baris-1][kolom-1] = nama;
                        } else {
                            System.out.println("Maaf, bangku tersebut sudah ditempati oleh orang lain! Silahkan cek di menu 2 untuk melihat bangku kosong");
                            break;
                        }
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
