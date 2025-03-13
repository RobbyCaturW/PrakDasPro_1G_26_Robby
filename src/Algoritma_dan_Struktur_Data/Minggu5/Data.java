package Algoritma_dan_Struktur_Data.Minggu5;

public class Data {
    String nama, nim;
    int tahunMasuk, nilaiUTS, nilaiUAS;
    public Data() {

    }
    
    public Data(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int nilaiUTSTertinggiDC(Data[] data, int left, int right) {
        int tertinggi;
        if (left == right) {
            return data[left].nilaiUTS;
        }

        int mid = (left+right)/2;
        int kiri = nilaiUTSTertinggiDC(data, left, mid);
        int kanan = nilaiUTSTertinggiDC(data, mid+1, right);
        if (kiri > kanan) tertinggi = kiri;
        else tertinggi = kanan; 
        return tertinggi;
    }

    int nilaiUTSTerendahDC(Data[] data, int left, int right) {
        int terendah;
        if (left == right) {
            return data[left].nilaiUTS;
        }

        int mid = (left+right)/2;
        int kiri = nilaiUTSTerendahDC(data, left, mid);
        int kanan = nilaiUTSTerendahDC(data, mid+1, right);
        if (kiri < kanan) terendah = kiri;
        else terendah = kanan;
        return terendah;
    }

    double rataNilaiBF(Data[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i].nilaiUAS;
        }
        double rata = (double) ((double) total / data.length);
        return  rata;
    }
}
