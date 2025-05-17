package Algoritma_dan_Struktur_Data.Pertemuan12;
public class LayananQueue_Tugas {
    NodeLayanan_Tugas head;
    NodeLayanan_Tugas tail;
    private int size;
    public LayananQueue_Tugas() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isAntrianKosong() {
        return this.head == null;
    }
    public boolean isAntrianAdaIsi() {
        return !isAntrianKosong();
    }
    public void tambahAntrian(String nim, String nama, String keterangan) {
        Mahasiswa_Tugas mahasiswaBaru = new Mahasiswa_Tugas(nim, nama, keterangan);
        NodeLayanan_Tugas nodeBaru = new NodeLayanan_Tugas(mahasiswaBaru);
        if (isAntrianKosong()) {
            this.head = nodeBaru;
            this.tail = nodeBaru;
        } else {
            this.tail.next = nodeBaru;
            this.tail = nodeBaru;
        }
        this.size++;
        System.out.println(mahasiswaBaru.nama + " berhasil ditambahkan ke dalam antrian.");
    }
    public Mahasiswa_Tugas panggilAntrian() {
        if (isAntrianKosong()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa untuk dipanggil.");
            return null;
        }
        Mahasiswa_Tugas mahasiswaDipanggil = this.head.data;
        this.head = this.head.next;
        this.size--;
        if (this.head == null) {
            this.tail = null;
        }
        System.out.println("Mahasiswa berikut dipanggil: " + mahasiswaDipanggil);
        return mahasiswaDipanggil;
    }
    public Mahasiswa_Tugas lihatAntrianTerdepan() {
        if (isAntrianKosong()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa terdepan.");
            return null;
        }
        System.out.println("Mahasiswa terdepan: " + this.head.data);
        return this.head.data;
    }
    public Mahasiswa_Tugas lihatAntrianTerakhir() {
        if (isAntrianKosong()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa terakhir.");
            return null;
        }
        System.out.println("Mahasiswa terakhir: " + this.tail.data);
        return this.tail.data;
    }
    public int getJumlahMahasiswaMengantre() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + this.size);
        return this.size;
    }
    public void kosongkanAntrian() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        System.out.println("Semua antrian telah dikosongkan.");
    }
    public void tampilkanSemuaAntrian() {
        if (isAntrianKosong()) {
            System.out.println("Antrian saat ini kosong.");
            return;
        }
        System.out.println("\n--- Daftar Mahasiswa dalam Antrian ---");
        NodeLayanan_Tugas current = this.head;
        int nomor = 1;
        while (current != null) {
            System.out.println(nomor + ". " + current.data);
            current = current.next;
            nomor++;
        }
        System.out.println("------------------------------------");
    }
}
