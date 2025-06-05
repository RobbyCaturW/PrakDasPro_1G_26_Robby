package Algoritma_dan_Struktur_Data.doublelinkedlist;

public class DLLFilm {
    NodeFilm head;
    int size;

    public DLLFilm() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, double rating) {
        NodeFilm newNode = new NodeFilm(id, judul, rating, null, head);
        if (head != null) head.prev = newNode;
        head = newNode;
        size++;
    }

    public void addLast(int id, String judul, double rating) {
        if (isEmpty()) {
            addFirst(id, judul, rating);
            return;
        }
        NodeFilm current = head;
        while (current.next != null) {
            current = current.next;
        }
        NodeFilm newNode = new NodeFilm(id, judul, rating, current, null);
        current.next = newNode;
        size++;
    }

    public void addAt(int id, String judul, double rating, int index) throws Exception {
        if (index < 0 || index > size) throw new Exception("Indeks di luar batas!");
        if (index == 0) {
            addFirst(id, judul, rating);
        } else if (index == size) {
            addLast(id, judul, rating);
        } else {
            NodeFilm current = head;
            for (int i = 0; i < index; i++) current = current.next;
            NodeFilm newNode = new NodeFilm(id, judul, rating, current.prev, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) throw new Exception("List kosong!");
        head = head.next;
        if (head != null) head.prev = null;
        size--;
    }

    public void removeLast() throws Exception {
        if (isEmpty()) throw new Exception("List kosong!");
        if (head.next == null) {
            head = null;
        } else {
            NodeFilm current = head;
            while (current.next != null) current = current.next;
            current.prev.next = null;
        }
        size--;
    }

    public void removeAt(int index) throws Exception {
        if (index < 0 || index >= size) throw new Exception("Indeks di luar batas!");
        if (index == 0) removeFirst();
        else if (index == size - 1) removeLast();
        else {
            NodeFilm current = head;
            for (int i = 0; i < index; i++) current = current.next;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public void print() {
        NodeFilm current = head;
        System.out.println("Cetak Data");
        while (current != null) {
            System.out.println("ID: " + current.id + "\n Judul: " + current.judul + "\n Rating: " + current.rating);
            current = current.next;
        }
    }

    public void findById(int id) {
        NodeFilm current = head;
        while (current != null) {
            if (current.id == id) {
                System.out.println("Data ID: " + current.id + "\n Judul Film: " + current.judul + "\nIMDB Rating: " + current.rating);
                return;
            }
            current = current.next;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    public void sortByRatingDesc() {
        if (head == null || head.next == null) return;
        for (NodeFilm i = head; i.next != null; i = i.next) {
            for (NodeFilm j = i.next; j != null; j = j.next) {
                if (i.rating < j.rating) {
                    double tempRating = i.rating;
                    String tempJudul = i.judul;
                    int tempId = i.id;

                    i.rating = j.rating;
                    i.judul = j.judul;
                    i.id = j.id;

                    j.rating = tempRating;
                    j.judul = tempJudul;
                    j.id = tempId;
                }
            }
        }
    }
}
