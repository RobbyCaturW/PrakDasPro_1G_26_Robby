package Algoritma_dan_Struktur_Data.Pertemuan2;

public class Dosen25 {
    String nama;
    String idDosen;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    public Dosen25() {

    }

    public Dosen25(String nama, String idDosen, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.nama = nama;
        this.idDosen = idDosen;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilinInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    void hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
