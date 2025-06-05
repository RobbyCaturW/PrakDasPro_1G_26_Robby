package Algoritma_dan_Struktur_Data.doublelinkedlist;

import java.util.Scanner;

public class FilmMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DLLFilm list = new DLLFilm();
        boolean running = true;

        while (running) {
            System.out.println("===================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("===================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("===================================");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID Film: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String judul1 = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double rating1 = sc.nextDouble();
                    list.addFirst(id1, judul1, rating1);
                    break;
                case 2:
                    System.out.println("ID Film: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul FIlm: ");
                    String judul2 = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double rating2 = sc.nextDouble();
                    list.addLast(id2, judul2, rating2);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.println("Urutan ke-");
                    System.out.println("ID Film: ");
                    int id3 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String judul3 = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double rating3 = sc.nextDouble();
                    System.out.println("Data Film ini akan masuk di urutan ke-" ); 
                    int index = sc.nextInt();
                    sc.nextLine();
                    list.addAt(id3, judul3, rating3, index - 1);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.print("Index yang ingin dihapus: ");
                    int rm = sc.nextInt();
                    list.removeAt(rm);
                    break;
                case 7:
                    list.print();
                    break;
                case 8:
                    System.out.println("Masukkan ID Film yang dicari ");
                    int find = sc.nextInt();
                    list.findById(find);
                    break;
                case 9:
                    list.sortByRatingDesc();
                    System.out.println("Data berhasil diurutkan!");
                    break;
                case 10:
                    running = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
