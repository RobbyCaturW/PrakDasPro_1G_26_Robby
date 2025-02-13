package Algoritma_dan_Struktur_Data.Pertemuan1;

public class RoyalGarden {
    static String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static int[][] stok = {
        {10, 5, 15, 7},
        {6, 11, 9, 13},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    static int[] harga = {750000, 50000, 60000, 100000};

    static void pendapatanSetiapCabang() {
        int pendapatan = 0;
        System.out.println("Pendapatan setiap cabang:");
        for (int i = 0; i < cabang.length; i++) {
            for (int j = 0; j < bunga.length; j++) {
                pendapatan += stok[i][j] * harga[j];
            }
            System.out.println("Pendapatan " + cabang[i] + ": " + pendapatan);
            pendapatan = 0;
        }
    }

    static void stokBungaRoyalGarden4() {
       System.out.println("Stok bunga di Royal Garden 4:\nAglonema: " + (stok[3][0] - 1) + "\nKeladi: " + (stok[3][1] - 2) + "\nAlocasia: " + (stok[3][2] - 0) + "\nMawar: " + (stok[3][3] - 5));
    }
    public static void main(String[] args) {
        pendapatanSetiapCabang();
        System.out.println();
        stokBungaRoyalGarden4();
    }
}
