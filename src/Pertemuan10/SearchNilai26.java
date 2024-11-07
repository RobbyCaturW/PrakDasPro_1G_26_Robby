package Pertemuan10;

public class SearchNilai26 {
    public static void main(String[] args) {
        int [] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        int key = 90;
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        if (hasil >= 0) System.out.println("Nilai " + key + " ketemu di index ke-" + hasil);
        else System.out.println("Nilai " + key + " tidak ditemukan");
        System.out.println();
        
    }
}