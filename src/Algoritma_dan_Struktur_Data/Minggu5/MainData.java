package Algoritma_dan_Struktur_Data.Minggu5;

public class MainData {
    public static void main(String[] args) {
        Data[] d = new Data[8];
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        String[] nim = {"220101001", "220101002", "220101003", "220101004", "220101005", "220101006", "220101007", "220101008"};
        int[] tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        for (int i = 0; i < d.length; i++) {
            d[i] = new Data(nama[i], nim[i], tahunMasuk[i], nilaiUTS[i], nilaiUAS[i]);
        }
        Data data = new Data();
        int terendah = data.nilaiUTSTerendahDC(d, 0, d.length-1);
        int tertinggi = data.nilaiUTSTertinggiDC(d, 0, d.length-1);

        for (Data i : d) {
            if (terendah == i.nilaiUTS) {
                System.out.println("===== NILAI UTS TERENDAH =====");
                System.out.println("Nama        : " + i.nama);
                System.out.println("NIM         : " + i.nim);
                System.out.println("Tahun Masuk : " + i.tahunMasuk);
                System.out.println("Nilai UTS   : " + i.nilaiUTS);
                System.out.println("Nilai UAS   : " + i.nilaiUAS);
            }
        }

        for (Data i : d) {
            if (tertinggi == i.nilaiUTS) {
                System.out.println("===== NILAI UTS TERTINGGI =====");
                System.out.println("Nama        : " + i.nama);
                System.out.println("NIM         : " + i.nim);
                System.out.println("Tahun Masuk : " + i.tahunMasuk);
                System.out.println("Nilai UTS   : " + i.nilaiUTS);
                System.out.println("Nilai UAS   : " + i.nilaiUAS);
            }
        }
        System.out.println();
        System.out.println("Rata-rata nilai UAS: " + data.rataNilaiBF(d));
    }
}