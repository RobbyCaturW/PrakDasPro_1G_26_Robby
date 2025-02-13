// Nama: Robby Catur Wicaksono
// NIM: 244107020048
// No. Absen: 26
package UAS;

import java.util.Scanner;

public class UAS1G26 {
    static String[] namaTIm26 = new String[4];
    static int[][] skorTIm26 = new int[4][2];
    static int[] totalSkor26 = new int[4];

    public static void tampilkanMenu() {
        // System.out.println();
        System.out.println("=== MENU UTAMA ===");
        System.out.println("1. Input Data Skor Tim");
        System.out.println("2. Tampilkan Tabel Skor");
        System.out.println("3. Tentukan Juara");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }

    public static void inputDataSkorTim(Scanner sc) {
        for (int i = 0; i < namaTIm26.length; i++) {
            System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
            namaTIm26[i] = sc.nextLine();
            for (int j = 0; j < skorTIm26[i].length; j++) {
                System.out.print("Masukkan skor " + namaTIm26[i] + " untuk level " + (j + 1) + ": ");
                skorTIm26[i][j] = sc.nextInt();
                sc.nextLine();
            }
            System.out.println();
        }
    }

    public static void tampilkanSkor() {
        // while (true) { 
        //     if (namaTIm26[0] == null) {
        //         System.out.println("Input Data Skor Tim Terlebih Dahulu!");
        //         break;
        //     }
            boolean isMore26 = false;
            System.out.println("Tabel Skor Turnamen");
            System.out.println("Nama Tim\tLevel 1\t\tLevel 2\t\tTotal Skor");
            for (int i = 0; i < namaTIm26.length; i++) {
                System.out.print(namaTIm26[i] + "\t\t");
                for (int j = 0; j < skorTIm26[i].length; j++) {
                    if (skorTIm26[i][j] < 35)
                        skorTIm26[i][j] = 0;
                    totalSkor26[i] += skorTIm26[i][j];
                    System.out.print(skorTIm26[i][j] + "\t\t");
                }
                if (skorTIm26[i][0] > 50 && skorTIm26[i][1] > 50)
                    isMore26 = true;
                if (totalSkor26[i] % 2 == 0)
                    totalSkor26[i] -= 15;
                if (isMore26)
                    totalSkor26[i] += 26;
                System.out.print(totalSkor26[i]);
                System.out.println();
                isMore26 = false;
                // break;
            // }
        }
    }

    public static void tentukanJuara() {
        // while (true) {
        //     if (namaTIm26[0] == null) {
        //         System.out.println("Input Data Skor Tim Terlebih Dahulu!");
        //         break;
        //     }
            int tertinggi26 = 0;
            int index26 = -1;
            // int level2Tertingg26 = 0;
            boolean isSeri26 = false;
            int indexPemenangSeri26 = -1;
            for (int i = 0; i < namaTIm26.length; i++) {
                if (totalSkor26[i] > tertinggi26) {
                    tertinggi26 = totalSkor26[i];
                    index26 = i;
                }
                if (totalSkor26[i] == tertinggi26) {
                    int total26 = 0;
                    if (skorTIm26[i][1] > total26) {
                        indexPemenangSeri26 = i;
                    }
                }
                // if (totalSkor26[i] == tertinggi26 && skorTIm26[i][1] == level2Tertingg26)
                // isSeri26 = true;
                // if (skorTIm26[i][1] > level2Tertingg26) level2Tertingg26 = skorTIm26[i][1];
            }
            if (isSeri26) System.out.println("Turnamen berakhir seri. Tim Terbaik adalah Robby Catur Wicaksono");
            else System.out.println("Selamat kepada Tim " + namaTIm26[index26 > indexPemenangSeri26 ? indexPemenangSeri26 : index26] + " yang telah memenangkan kompetisi!");
        //     break;
        // }
    } 

    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        boolean isRunning26 = true;
        while (isRunning26) {
            tampilkanMenu();
            int pilihan26 = sc26.nextInt();
            sc26.nextLine();
            switch (pilihan26) {
                case 1:
                    inputDataSkorTim(sc26);
                    break;
                case 2:
                    tampilkanSkor();
                    break;
                case 3:
                    tentukanJuara();
                    break;
                case 4:
                    System.out.println("Selesai!");
                    isRunning26 = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

}