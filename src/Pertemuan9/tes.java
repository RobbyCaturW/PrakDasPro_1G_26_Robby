package Pertemuan9;

public class tes {
    public static void main (String[] args) {
        char letter = 'a';
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(letter);
                letter++;
            }
            System.out.println();
        }
    }
}
