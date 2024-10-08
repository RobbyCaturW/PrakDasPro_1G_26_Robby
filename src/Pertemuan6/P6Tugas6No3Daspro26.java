package Pertemuan6;

import java.util.Scanner;

public class P6Tugas6No3Daspro26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merk, kategori;
        int ukuran;
        System.out.print("Masukkan Merk Sepatu: ");
        merk = input.nextLine();
        System.out.print("Masukkan Kategori Sepatu: ");
        kategori = input.nextLine();
        System.out.print("Masukkan Ukuran Sepatu: ");
        ukuran = input.nextInt();
        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran == 36) System.out.println("Harga Rp800.000");
                else if (ukuran == 37) System.out.println("Harga Rp800.000");
                else if (ukuran == 38) System.out.println("Harga Rp800.000");
                else if (ukuran == 39) System.out.println("Harga Rp800.000");
                else if (ukuran == 40) System.out.println("Harga Rp800.000");
            } else if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran == 40) System.out.println("Harga Rp1.200.000");
                else if (ukuran == 41) System.out.println("Harga Rp1.200.000");
                else if (ukuran == 42) System.out.println("Harga Rp1.200.000");
                else if (ukuran == 43) System.out.println("Harga Rp1.200.000");
                else if (ukuran == 44) System.out.println("Harga Rp1.200.000");
            }
        } else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran == 36) System.out.println("Harga Rp1.000.000");
                if (ukuran == 37) System.out.println("Harga Rp1.000.000");
                if (ukuran == 38) System.out.println("Harga Rp1.000.000");
                if (ukuran == 39) System.out.println("Harga Rp1.000.000");
                if (ukuran == 40) System.out.println("Harga Rp1.000.000");
                if (ukuran == 41) System.out.println("Harga Rp1.800.000");
            } else if (kategori.equalsIgnoreCase("man")){
                if (ukuran == 41) System.out.println("Harga Rp1.800.000");
                if (ukuran == 42) System.out.println("Harga Rp1.800.000");
                if (ukuran == 43) System.out.println("Harga Rp1.800.000");
                if (ukuran == 44) System.out.println("Harga Rp1.800.000");
            }
        } else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran == 36) System.out.println("Harga Rp750.000");
                if (ukuran == 37) System.out.println("Harga Rp750.000");
                if (ukuran == 38) System.out.println("Harga Rp750.000");
                if (ukuran == 39) System.out.println("Harga Rp750.000");
                if (ukuran == 40) System.out.println("Harga Rp750.000");
            } else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran == 40) System.out.println("Harga Rp1.500.000");
                if (ukuran == 41) System.out.println("Harga Rp1.500.000");
                if (ukuran == 42) System.out.println("Harga Rp1.500.000");
                if (ukuran == 43) System.out.println("Harga Rp1.500.000");
                if (ukuran == 44) System.out.println("Harga Rp1.500.000");
            }
        }
    }
}
