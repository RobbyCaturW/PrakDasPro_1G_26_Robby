package Pertemuan4;

import java.util.Scanner;

public class jam26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama26, nim26, absen26;
        int hour26, minute26, time26, totalHour26, totalMinute26;
        nama26 = "Robby Catur Wicaksono";
        nim26 = "244107020048";
        absen26 = "26";
        System.out.println("Nama\t: " + nama26);
        System.out.println("NIM\t: " + nim26);
        System.out.println("Absen\t: " + absen26);
        System.out.println("========== PROGRAM MENGHITUNG JAM KULIAH ==========");
        System.out.print("Masukkan jam saat ini: ");
        hour26 = input.nextInt();
        System.out.print("Masukkan menit saat ini: ");
        minute26 = input.nextInt();
        System.out.println("Jam saat ini: " + hour26 + ":" + minute26);
        System.out.print("\nMasukkan lama kuliah dalam menit: ");
        time26 = input.nextInt();
        totalHour26 = (hour26 + (minute26 + time26) / 60);
        totalMinute26 = (minute26 + time26) % 60;
        System.out.println("Waktu kepulangan Anda selesai kuliah pada pukul: " + totalHour26 + ":" + totalMinute26);
        input.close();
    }
}