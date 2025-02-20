package Algoritma_dan_Struktur_Data.Pertemuan2;

public class DosenMain25 {
    public static void main(String[] args) {
        Dosen25 dosen1 = new Dosen25();
        dosen1.nama = "Cahya Rahmad, ST., M.Kom., Dr. Eng";
        dosen1.idDosen = "DSN-211098745";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Sistem Informasi";
        dosen1.tampilinInformasi();
        dosen1.hitungMasaKerja(2025);

        Dosen25 dosen2 = new Dosen25("Ariadi Retno Ririd, S.Kom., M.Kom.", "DSN-211098746", true, 2015, "Sistem Informasi");
        dosen2.ubahKeahlian("Pemrograman");
        dosen2.setStatusAktif(false);
        dosen2.tampilinInformasi();
        dosen2.hitungMasaKerja(2025);
    }
}
