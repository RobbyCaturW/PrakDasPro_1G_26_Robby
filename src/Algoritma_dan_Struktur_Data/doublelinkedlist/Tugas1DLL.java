package Algoritma_dan_Struktur_Data.doublelinkedlist;

public class Tugas1DLL {
    Tugas1Node head;
    int size;

    public Tugas1DLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String no, String nama) {
        Tugas1Node newNode = new Tugas1Node(no, nama, null, head);
        if (!isEmpty()) {
            head.prev = newNode;
        }
        head = newNode;
      size++;
    }

    public void addLast(String no, String nama) {
        if (isEmpty()) {
            addFirst(no, nama);
        } else {
            Tugas1Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Tugas1Node newNode = new Tugas1Node(no, nama, current, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String no, String nama, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }

        if (isEmpty() || index == 0) {
            addFirst(no, nama);
        } else if (index == size) {
            addLast(no, nama);
        } else {
            Tugas1Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }

            Tugas1Node newNode = new Tugas1Node(no, nama, current.prev, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
        if (head.next == null) {
            head = null;
        } else {
            Tugas1Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size || index < 0) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Tugas1Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public String getNomor(int index) throws Exception {
        if (isEmpty() || index >= size || index < 0) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Tugas1Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.no;
    }

    public String getNama(int index) throws Exception {
        if (isEmpty() || index >= size || index < 0) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Tugas1Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.nama;
    }
}
