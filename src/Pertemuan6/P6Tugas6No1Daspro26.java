package Pertemuan6;

import java.util.Scanner;

public class P6Tugas6No1Daspro26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, angka3;
        System.out.print("Masukkan Angka 1: ");
        angka1 = input.nextInt();
        System.out.print("Masukkan Angka 2: ");
        angka2 = input.nextInt();
        System.out.print("Masukkan Angka 3: ");
        angka3 = input.nextInt();
        if (angka1 > angka2) {
            if (angka1 > angka3) {
                System.out.println("Bilangan terbesar: " + angka1);
            } else if (angka2 > angka3) {
                System.out.println("Bilangan terbesar: " + angka3);
            }
        } else {
            if (angka2 > angka3) System.out.println("Bilangan terbesar: " + angka2);
            else System.out.println("Bilangan terbesar: " + angka3);
        }
    }
}
