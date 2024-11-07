package Pertemuan10;

import java.util.Scanner;

public class Tugas326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Bakmi", "Kentang Goreng", "Ice Tea", "Cappucino", "Orange Juice", "Matcha", "Vanila Latte"};
        System.out.print("Masukkan nama makanan/minuman: ");
        String menu = sc.nextLine();
        boolean isFound = false;
        for (int i = 0; i < daftarMenu.length; i++) {
            if (menu.equalsIgnoreCase(menu) == daftarMenu[i].equalsIgnoreCase(daftarMenu[i])) isFound = true;
            else isFound = false;
        } System.out.println("Menu " + menu + (isFound ? " ada di menu" : " tidak ada di menu"));
    }
}
