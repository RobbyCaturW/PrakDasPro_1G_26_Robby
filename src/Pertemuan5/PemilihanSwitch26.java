package Pertemuan5;

import java.util.Scanner;

public class PemilihanSwitch26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * /) ");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
            break;
            case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
            break;
            case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
            break;
            case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
            break;
            default:
            System.out.println("Operator yang dipilih tidak sesuai");
            break;
        }
    }
    
}
