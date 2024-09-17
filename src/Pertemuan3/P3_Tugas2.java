package Pertemuan3;

import java.util.Scanner;

/**
 * P3_Tugas2
 */
public class P3_Tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahJamKerja, upahPerJam, gajiKaryawan, gajiSebelumPajak, gajiBersih;
        System.out.print("Masukkan jumlah jam kerja karyawan: ");
        jumlahJamKerja = input.nextInt();
        System.out.print("Masukkan upah per jam: ");
        upahPerJam = input.nextInt();
        float bonusGaji, gajiSetelahPajak;
        gajiKaryawan = jumlahJamKerja * upahPerJam;
        System.out.println("Gaji Karyawan: " + gajiKaryawan);
        bonusGaji = gajiKaryawan * (10 / 100f);
        System.out.println("Bonus Gaji: " + bonusGaji);
        gajiSebelumPajak = (int) (gajiKaryawan + bonusGaji);
        System.out.println("Gaji Sebelum Pajak: " + gajiSebelumPajak);
        gajiSetelahPajak = bonusGaji * (5 / 100f);
        System.out.println("Gaji Setelah Pajak: " + gajiSetelahPajak);
        gajiBersih = (int) (gajiKaryawan - gajiSetelahPajak);
        System.out.println("Gaji bersih sebesar: " + gajiBersih);
    }
}