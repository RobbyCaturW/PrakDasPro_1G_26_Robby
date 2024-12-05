package Pertemuan13;

import java.util.Scanner;

public class Kubus26 {
    public static int luasPermukaan(int sisi) {
        int lp = 6 * sisi *sisi;    
        return lp;
    }
    static int volumeKubus(int sisi) {
        int vol = sisi * sisi * sisi;
        return vol;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisi;
        System.out.print("Masukkan sisi kubus: ");
        sisi = sc.nextInt();
        System.out.println("Luas Permukaan: " + luasPermukaan(sisi));
        System.out.println("Volume: " + volumeKubus(sisi));
    }
}
