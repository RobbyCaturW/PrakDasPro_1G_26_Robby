package Pertemuan9;
import java.util.Scanner;
public class Porseni26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        String pemainBadminton = "", pemainTenisMeja = "", pemainBasket = "", pemainVoly = "";
        boolean badminton = false, tenismeja = false, basket = false, voly = false;
        do {
            System.out.println("=============================");
            System.out.println("\tPORSENI 2024");
            System.out.println("=============================");
            System.out.println("Pilih Menu:\n0. Keluar\n1. Badminton\n2. Tenis Meja\n3. Basket\n4. Bola Voly");
            System.out.print("Masukkan angka: ");
            menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                if (!badminton) {
                    System.out.println("Input nama pemain untuk kategori badminton");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Masukkan nama pemain Badminton ke-" + i + ": ");
                        pemainBadminton += i + ". " + sc.nextLine() + "\n";
                    }
                    badminton = true;
                } else {
                    System.out.println("=============================\nDaftar nama pemain Badminton untuk Porseni\n============================= ");
                    System.out.println(pemainBadminton);
                    System.out.println("Kembali ke menu? (y/n)");
                    String back = sc.nextLine();
                    if (back.equalsIgnoreCase("n")) break;
                }
            } else if (menu == 2) {
                if (!tenismeja) {
                    System.out.println("Input nama pemain untuk kategori tenis meja");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Masukkan nama pemain tenis meja ke-" + i + ": ");
                        pemainTenisMeja += i + ". " + sc.nextLine() + "\n";
                    }
                    tenismeja = true;
                } else {
                    System.out.println("=============================\nDaftar nama pemain tenis meja untuk Porseni\n=============================");
                    System.out.println(pemainTenisMeja);
                    System.out.println("Kembali ke menu? (y/n)");
                    String back = sc.nextLine();
                    if (back.equalsIgnoreCase("n")) break;
                }
            } else if (menu == 3) {
                if (!basket) {
                    System.out.println("Input nama pemain untuk kategori basket");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Masukkan nama pemain basket ke-" + i + ": ");
                        pemainBasket += i + ". " + sc.nextLine() + "\n";
                    }
                    basket = true;
                } else {
                    System.out.println("=============================\nDaftar nama pemain basket untuk Porseni\n=============================");
                    System.out.println(pemainBasket);
                    System.out.println("Kembali ke menu? (y/n)");
                    String back = sc.nextLine();
                    if (back.equalsIgnoreCase("n")) break;
                }
            } else if (menu == 4) {
                if (!voly) {
                    System.out.println("Input nama pemain untuk kategori bola voly");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Masukkan nama pemain bola voly ke-" + i + ": ");
                        pemainVoly += i + ". " + sc.nextLine() + "\n";
                    }
                    voly = true;
                } else {
                    System.out.println("=============================\nDaftar nama pemain bola voly untuk Porseni\n=============================");
                    System.out.println(pemainVoly);
                    System.out.println("Kembali ke menu? (y/n)");
                    String back = sc.nextLine();
                    if (back.equalsIgnoreCase("n")) break;
                }
            } else if (menu == 0) break;
        } while (true);
        sc.close();
    }
}