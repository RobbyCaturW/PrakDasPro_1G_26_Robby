package Algoritma_dan_Struktur_Data.Kuis1;

public class Bioskop {
    String film;
    int hargaTiket, jmlFilm;
    double rating;

    public Bioskop () {

    }

    public Bioskop (String namaFilm, double rating, int hargaTiket) {
        film = namaFilm;
        this.rating = rating;
        this.hargaTiket = hargaTiket;

    }

    public void tampilkanJadwalFilm(Bioskop[] arrayOfBioskop) {
        System.out.println("\n\n===== DAFTAR SEMUA FILM =====\n");
        int count = 1;
        for (Bioskop bioskop : arrayOfBioskop) {
            System.out.println(count + ". " + bioskop.film);
            System.out.println("Rating: " + bioskop.rating);
            System.out.println("Harga Tiket: " + bioskop.hargaTiket);
            System.out.println("==========================");
            count++;
        }
    }

    public void tampilkanRatingTertinggi(Bioskop[] arrayOfBioskop) {
        double tertinggi = 0;
        for (Bioskop bioskop : arrayOfBioskop) {
            if (bioskop.rating > tertinggi) tertinggi = bioskop.rating;
        }

        int count = 1;
        for (Bioskop bioskop : arrayOfBioskop) {
            if (bioskop.rating == tertinggi) {
                System.out.println("\n\n===== Film dengan Rating Tertinggi =====");
                System.out.println(count + ". " + bioskop.film);
                System.out.println("Rating: " + bioskop.rating);
                System.out.println("==========================");
                count++;
            }
        }
    }

    public void tampilkanTiketTermurah(Bioskop[] arrayOfBioskop) {
        int termurah = 1_000_000;
        for (Bioskop bioskop : arrayOfBioskop) {
            if (bioskop.hargaTiket < termurah) termurah = bioskop.hargaTiket;
        }

        int count = 1;
        for (Bioskop bioskop : arrayOfBioskop) {
            if(bioskop.hargaTiket == termurah) {
                System.out.println("===== Film dengan Harga Tiket Termurah =====");
                System.out.println(count + ". " + bioskop.film);
                System.out.println("Harga Tiket: " + bioskop.hargaTiket);
                count ++;
            }
        }
    }
}
