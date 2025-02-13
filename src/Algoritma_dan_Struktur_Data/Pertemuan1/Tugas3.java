package Algoritma_dan_Struktur_Data.Pertemuan1;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] namaMK = new String[n];
        int[] SKS = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMata Kuliah " + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("Jumlah SKS: ");
            SKS[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Tampilkan mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\nSeluruh Jadwal Kuliah:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(namaMK[i] + " | SKS: " + SKS[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                    }
                    break;

                case 2:
                    System.out.print("\nMasukkan hari yang ingin dicari: ");
                    String hari = sc.nextLine();
                    System.out.println("\nJadwal Kuliah pada hari " + hari + ":");
                    boolean isFoundHari = false;
                    for (int i = 0; i < n; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(hari)) {
                            System.out.println(namaMK[i] + " | SKS: " + SKS[i] + " | Semester: " + semester[i]);
                            isFoundHari = true;
                        }
                    }
                    if (!isFoundHari) {
                        System.out.println("Tidak ada mata kuliah pada hari " + hari);
                    }
                    break;

                case 3:
                    System.out.print("\nMasukkan semester yang ingin dicari: ");
                    int cariSemester = sc.nextInt();
                    System.out.println("\nJadwal Kuliah pada Semester " + cariSemester + ":");
                    boolean isFoundSemester = false;
                    for (int i = 0; i < n; i++) {
                        if (semester[i] == cariSemester) {
                            System.out.println(namaMK[i] + " | SKS: " + SKS[i] + " | Hari: " + hariKuliah[i]);
                            isFoundSemester = true;
                        }
                    }
                    if (!isFoundSemester) {
                        System.out.println("Tidak ada mata kuliah pada Semester " + cariSemester);
                    }
                    break;

                case 4:
                    System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
                    String cariMK = sc.nextLine();
                    boolean isFoundMK = false;
                    for (int i = 0; i < n; i++) {
                        if (namaMK[i].equalsIgnoreCase(cariMK)) {
                            System.out.println("Nama Mata Kuliah: " + namaMK[i] + " | SKS: " + SKS[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                            isFoundMK = true;
                        }
                    }
                    if (!isFoundMK) {
                        System.out.println("Mata kuliah dengan nama " + cariMK + " tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Selesai!");
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}