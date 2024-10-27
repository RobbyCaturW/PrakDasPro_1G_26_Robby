package Pertemuan9;

import java.util.Scanner;

public class RataNIlai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, nilaiMhs;
        float totalNIlai, rataNilai;
        i = 1;
        while (i <= 5) {
            totalNIlai = 0;
            System.out.println("Input nilai mahasiswa ke-" + i);
            for (j = 1; j <= 5; j++) {
                System.out.print("NIlai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNIlai += nilaiMhs;
            }
            rataNilai = totalNIlai / 5;
            System.out.println("Rata nilai mahasiswa ke-" + i + " adalah " + rataNilai);
            i++;
        }
    }
}
