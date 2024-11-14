package Pertemuan11;
import java.util.Scanner;

/**
 * tes
 */
public class Tugas26 {

    public static void main(String[] args) {
        int responden = 10, pertanyaan = 6;
        int[][] survei = new int[responden][pertanyaan];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < responden; i++) {
            // responden ke-i
            System.out.println("Penilaian untuk responden ke-" + (i+1));
            for (int j = 0; j < pertanyaan; j++) {
                // peertanyaan le-j
                System.out.print("Input nilai ke-" + (j+1) + ": ");
                survei[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int totalNilaiRes = 0;
        double rataRes = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalNilaiRes += survei[i][j];
            }
            rataRes += (double) totalNilaiRes / pertanyaan;
            System.out.println("Rata responden ke-" + (i+1) + ": " + rataRes);
            totalNilaiRes = 0;
            rataRes = 0;
        }
        
        int totalNilaiPer = 0;
        double rataPer = 0;
        System.out.println();
        for (int i = 0; i < pertanyaan; i++) {
            for (int j = 0; j < responden; j++) {
                totalNilaiPer += survei[j][i];
            }
            rataPer += (double) totalNilaiPer / pertanyaan;
            System.out.println("Rata pertanyaan ke-" + (i+1) + ": " + rataPer);
            totalNilaiPer = 0;
            rataPer = 0;
        }
        
        int[] value = new int[pertanyaan * responden];
        int index = 0, total = 0;
        double rataKeseluruhan = 0;
        System.out.println();
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                value[index] = survei[i][j];
                index++;
            }
        }
        for (int i = 0; i < value.length; i++) {
            total += value[i];
        }
        rataKeseluruhan += (double) total / value.length;
        System.out.println("Jumlah rata-rata: " + (rataKeseluruhan));
    }
}