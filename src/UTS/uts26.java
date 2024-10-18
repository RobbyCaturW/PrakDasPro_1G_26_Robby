package UTS;

import java.util.Scanner;

public class uts26 {
    public static void main (String[] args) {
        Scanner robby = new Scanner(System.in);
        double komisi26 = 0;
        int hargaSepeda26 = 1_500_000;
        String nama26 = "", alamat26 = "", nohp26 = "", ctk26, menu26;
        int jmlJual26 = 0, jmlSpd26 = 0, jmlCuti26 = 0, masaKerja26 = 0, tunjangan26 = 0,  cuti26 = 0, gajiKaryawan26;
        boolean menu1 = false;
        do {
        System.out.println("=== UTS PRAKTIKUM DASAR PEMROGRAMAN TI-1G ===");
        System.out.println("dibuat oleh: Robby Catur Wicaksono");
        System.out.println("NIM: 244107020048");
        System.out.println("==============================================");
        System.out.println("Pilih Menu: ");
        System.out.println("1. Data Karyawan");
        System.out.println("2. Gaji Karyawan");
        System.out.print("menu: ");
        menu26 = robby.nextLine();
        if (menu26.equalsIgnoreCase("1")) {
                menu1 = true;
                System.out.println("Masukkan data Karyawan");
                System.out.print("Nama: ");
                nama26 = robby.nextLine();
                System.out.print("Alamat: ");
                alamat26 = robby.nextLine();
                System.out.print("NoHp: ");
                nohp26 = robby.nextLine();
                System.out.print("Jumlah Penjualan Sepeda: ");
                jmlSpd26 = robby.nextInt();
                robby.nextLine();
                System.out.print("Masa Kerja: ");
                masaKerja26 = robby.nextInt();
                robby.nextLine();
                System.out.print("Jumlah Cuti: ");
                jmlCuti26 = robby.nextInt();
                robby.nextLine();
                System.out.println("Apakah Anda ingin mencetak data karyawan? (y/t)");
                ctk26 = robby.nextLine();
                if (ctk26.equalsIgnoreCase("y")) {
                    System.out.println("=========================");
                    System.out.println("Data Karyawan");
                    System.out.println("=========================");
                    System.out.println("Nama: " + nama26);
                    System.out.println("Alamat: "+alamat26);
                    System.out.println("Nohp: " + nohp26);
                    System.out.println("Jumlah Penjualan Sepeda: " + jmlSpd26 + " Sepeda");
                    System.out.println("Masa Kerja: " + masaKerja26 + " Tahun");
                    System.out.println("Lama Cuti: " + jmlCuti26 + " Hari");
                    System.out.println("Kembali ke menu? (y/t)");
                    menu26 = robby.nextLine();
                    if (menu26.equalsIgnoreCase("t")) break;
                } else break;
                menu1 = true;
            } if (menu26.equalsIgnoreCase("2")) {
                if (!menu1) {
                    System.out.println("Masukkan data Karyawan terlebih dahulu");
                    System.out.println("Kembali ke menu? (y/t)");
                    menu26 = robby.nextLine();
                    if (menu26.equals("t")) break;
                } else {
                jmlJual26 = hargaSepeda26 * jmlSpd26;
                if (jmlJual26 <= 3_000_000) {
                    komisi26 += jmlJual26 * 0.2 / 10;
                } else if (jmlJual26 > 3_000_000 && jmlJual26 <= 5_000_000) {
                    komisi26 += jmlJual26 * 0.5 / 10;
                }else if (jmlJual26 > 5_000_000 && jmlJual26 <= 10_000_000) {
                    komisi26 += jmlJual26 * 0.7 / 10;
                } else if (jmlJual26 > 10_000_000) {
                    komisi26 += jmlJual26 * 0.15 / 10;
                }
                if (masaKerja26 < 3) {
                    tunjangan26 = 0;
                } else if (masaKerja26 >= 3 && masaKerja26 <= 5) {
                    tunjangan26 = 1_000_000;
                } else if (masaKerja26 >= 6 && masaKerja26 <= 8) {
                    tunjangan26 = 2000000;
                } else if (masaKerja26 > 8) {
                    tunjangan26 = 3000000;
                }
                cuti26 += 35000 * jmlCuti26;
                int jmlKomisi26 = (int) komisi26;
                gajiKaryawan26 = (int) ((int) komisi26 + tunjangan26 - cuti26);
                System.out.println("=========================");
                System.out.println("Data Gaji Karyawan");
                System.out.println("=========================");
                System.out.println("Nama: " + nama26);
                System.out.println("Komisi penjualan: " + jmlKomisi26);
                System.out.println("Tunjangan: " + tunjangan26);
                System.out.println("Potongan cuti: " + cuti26);
                System.out.println("Gaji yang diterima: " + gajiKaryawan26);
                System.out.println("Kembali ke menu? (y/t)");
                menu26 = robby.nextLine();
                if (menu26.equalsIgnoreCase("t")) break;
            }
            }
        } while (true);
        
    } 
}