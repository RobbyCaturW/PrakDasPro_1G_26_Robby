package Algoritma_dan_Struktur_Data.Pertemuan12;

public class Mahasiswa25 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa25() {
    }

    public Mahasiswa25(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t"  + ipk);
    }
}
