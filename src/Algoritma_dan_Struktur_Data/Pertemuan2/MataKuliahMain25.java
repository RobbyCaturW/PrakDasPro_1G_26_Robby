package Algoritma_dan_Struktur_Data.Pertemuan2;

public class MataKuliahMain25 {
    public static void main(String[] args) {
        MataKuliah25 mk1 = new MataKuliah25();
        mk1.kodeMK = "MK001";
        mk1.nama = "Basis Data";
        mk1.sks = 3;
        mk1.jumlahJam = 8;
        mk1.tampilinInformasi();

        MataKuliah25 mk2 = new MataKuliah25("MK002", "Algoritma dan Struktur Data", 2, 10);
        mk2.tampilinInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);
    }
}
