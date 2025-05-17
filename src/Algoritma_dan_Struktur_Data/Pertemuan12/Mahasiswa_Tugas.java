package Algoritma_dan_Struktur_Data.Pertemuan12;

public class Mahasiswa_Tugas {
    String nim;
    String nama;
    String keterangan;
    public Mahasiswa_Tugas(String nim, String nama, String keterangan) {
        this.nim = nim;
        this.nama = nama;
        this.keterangan = keterangan;
    }
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Keperluan: " + keterangan;
    }
}
