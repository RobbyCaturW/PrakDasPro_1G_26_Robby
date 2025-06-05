package Algoritma_dan_Struktur_Data.doublelinkedlist;

import java.util.Scanner;

public class Tugas1Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Tugas1DLL dll = new Tugas1DLL();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSI EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");;
            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian: ");
                    String antrian = sc.nextLine();
                    System.out.print("Nama Penerima: ");
                    String penerima = sc.nextLine();
                    dll.addLast(antrian, penerima);
                    break;
                case 2:
                    if (dll.isEmpty()) {
                        System.out.println("Tidak ada data untuk dihapus!");
                    } else {
                        String nama = dll.getNama(0);
                        dll.removeFirst();
                        System.out.println(nama + " berhasil divaksinasi!");
                    }
                    break;
                case 3:
                    System.out.println("+++++++++++++++++++++++");
                    System.out.println("Daftar Pengantri Vaksin");
                    System.out.println("+++++++++++++++++++++++");
                    System.out.println("| No.\t| Nama\t|");
                    for (int i = 0; i < dll.size(); i++) {
                        System.out.printf("| %s\t| %s\t|\n", dll.getNomor(i), dll.getNama(i));
                    }
                    System.out.println("Sisa Antrian: " + dll.size());
                    break;
                case 4:
                    System.out.println("Selesai!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
                    break;
            }
        }
        sc.close();
    }
}
