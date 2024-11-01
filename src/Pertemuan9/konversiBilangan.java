package Pertemuan9;

public class konversiBilangan {
    public static void main(String[] args) {
        // diketahui
        double suhu = 28.6; // suhu
        int kelembapan = 65; // kelembapan
        int co2 = 420; // CO2
        int suhuInt = (int) suhu; // ubah suhu dari double ke int
        System.out.print("Suhu: " + suhu + " °C"); 
        System.out.print(" (Biner: ");
        int[] binerSuhu = new int[32]; // buat array baru untuk diisi nilai biner dari suhu
        int i = 0; //index awal untuk mengisi binerSuhu
        while (suhuInt > 0) { // kondisi
            binerSuhu[i] = suhuInt % 2; // isi biner suhu
            suhuInt /= 2; // ubah nilai suhuInt
            i++; // peningkatan nilai i secara berkala hingga suhuInt = 0
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binerSuhu[j]); // cetak binerSuhu
        }
        System.out.print(", Heksadesimal: ");
        char[] hexSuhu = new char[32]; // buat array baru untuk diisi nilai heksadesimal dari suhu
        i = 0; // reset nilai i ke 0
        suhuInt = (int) suhu; // reset nilai suhu ke awal
        char[] heksadesimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}; // heksadesimal
        while (suhuInt > 0) { // kondisi
            hexSuhu[i] = heksadesimal[suhuInt % 16]; // isi hexSuhu
            suhuInt /= 16; // ubah nilai suhuInt
            i++; // peningkatan nilai i secara berkala
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hexSuhu[j]); // cetak hexSuhu
        }
        System.out.println(")");
        System.out.print("Kelembapan : " + kelembapan + " %");
        System.out.print(" (Biner: ");
        int[] binerKelembapan = new int[32]; // buat array baru untuk diisi nilai biner kelembapan
        i = 0; // reset nilai i
        while (kelembapan > 0) { // kondisi
            binerKelembapan[i] = kelembapan % 2; // isi array binerKelembapan
            kelembapan /= 2; // ubah nilai kelembapan
            i++; // peningkatan nilai i secara berkala
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binerKelembapan[j]); // cetak binerKelembapan
        }
        System.out.print(", Heksadesimal: ");
        char[] hexKelembapan = new char[32]; // buat array baru untuk diisi nilai heksadesimal
        i = 0; // reset nilai i
        kelembapan = 65; // kembalikan nilai kelembapan ke kondisi awal
        while (kelembapan > 0) { // kondisi
            hexKelembapan[i] = heksadesimal[kelembapan % 16]; // isi array hexKelembapan
            kelembapan /= 16; // ubah nilai kelembapan
            i++; // peningkatan nilai i secara berkala
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hexKelembapan[j]); // cetak nilai kelembapan
        }
        System.out.println(")");
        System.out.print("CO2: " + co2 + " ppm"); 
        System.out.print(" (Biner: ");
        int[] binerCO2 = new int[32]; // buat array baru untuk diisi nilai biner CO2
        i = 0; // reset nilai i
        while (co2 > 0) { // kondisi
            binerCO2[i] = co2 % 2; // isi array binerCO2
            co2 /= 2; // ubah nilai co2
            i++; // peningkatan nilai i secara berkala
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binerCO2[j]); // cetak binerCO2
        }
        System.out.print(", Heksadesimal: ");
        char[] hexCO2 = new char[32]; // buat array baru untuk diisi nilai heksadesimal CO2
        i = 0; //reset nilai i
        co2 = 420; // kembalikan nilai CO2
        while (co2 > 0) { // kondisi
            hexCO2[i] = heksadesimal[co2 % 16]; // isi array hexCO2
            co2 /= 16; // ubah nilai co2
            i++; // peningkatan nilai i secara berkala
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hexCO2[j]); // cetak hexCO2
        }
        System.out.println(")");
    }
}