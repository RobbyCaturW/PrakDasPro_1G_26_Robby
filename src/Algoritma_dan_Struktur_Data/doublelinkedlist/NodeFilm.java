package Algoritma_dan_Struktur_Data.doublelinkedlist;

public class NodeFilm {
    int id;
    String judul;
    double rating;
    NodeFilm prev, next;

    public NodeFilm(int id, String judul, double rating, NodeFilm prev, NodeFilm next) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.prev = prev;
        this.next = next;
    }
}
