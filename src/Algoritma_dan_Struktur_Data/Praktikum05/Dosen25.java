package Algoritma_dan_Struktur_Data.Praktikum05;

public class Dosen25 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    public Dosen25 () {

    }
    public Dosen25(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin: " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia: " + usia + " tahun");
    }
}