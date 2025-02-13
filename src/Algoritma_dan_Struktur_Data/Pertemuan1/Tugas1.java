package Algoritma_dan_Struktur_Data.Pertemuan1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' '},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' '},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' '},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' '},
            {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' '},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' '},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' '},
            {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '},
            {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' '}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char kodePlat = sc.next().charAt(0);
        for (int i = 0; i < kode.length; i++) {
            if (Character.toUpperCase(kodePlat) == kode[i]) {
                System.out.print("Kota asal kendaraan: ");
                for (int j = 0; j < kota[i].length; j++) {
                    if (kota[i][j] != ' ') {
                        System.out.print(kota[i][j]);
                    }
                }
            }
        }
    }
}
