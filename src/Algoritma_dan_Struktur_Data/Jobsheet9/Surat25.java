package Algoritma_dan_Struktur_Data.Jobsheet9;

public class Surat25 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;
    boolean isValid;
    public Surat25() {
    }

    public Surat25(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void valid(boolean valid) {
        isValid = valid;
    }
}
