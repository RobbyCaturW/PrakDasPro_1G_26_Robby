package Algoritma_dan_Struktur_Data.Jobsheet9;

public class StackSurat25 {
    Surat25[] stack;
    int top, size;

    public StackSurat25(int size) {
        this.size = size;
        stack = new Surat25[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat25 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    
    public Surat25 pop() {
        if (!isEmpty()) {
            Surat25 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas umtuk dinilai.");
            return null;
        }
    }

    public Surat25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    int cari(String cari) {
        int posisi = -1;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void print(int posisi) {
        System.out.println("ID Surat: " + stack[posisi].idSurat);
        System.out.println("Nama: " + stack[posisi].namaMahasiswa);
        System.out.println("Kelas: " + stack[posisi].kelas);
        System.out.println("Jenis Izin: " + stack[posisi].jenisIzin);
        System.out.println("Durasi: " + stack[posisi].durasi);
    }
}
