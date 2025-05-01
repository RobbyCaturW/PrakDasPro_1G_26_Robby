package Algoritma_dan_Struktur_Data.Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumMhs = sc.nextInt();
        MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25(jumMhs);
        sc.nextLine();

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM\t : ");
            String nim = sc.nextLine();
            System.out.print("Nama\t : ");
            String nama = sc.nextLine();
            System.out.print("Kelas\t : ");
            String kls = sc.nextLine();
            System.out.print("IPK\t : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("------------------------------------");
            Mahasiswa25 mhs = new Mahasiswa25(nim, nama, kls, ipk);
            list.tambah(mhs);
        }
        list.tampil();
        // melakukan pencarian data sequential
        System.out.println("------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        
        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        
        System.out.println("------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
