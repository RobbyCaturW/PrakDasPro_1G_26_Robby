package Algoritma_dan_Struktur_Data.Praktikum03;

public class DataDosen25 {
    static void dataSemuaDosen(Dosen25[] arrayOfDosen) {
        System.out.println("\nData Semua Dosen:");
        for (Dosen25 dosen : arrayOfDosen) {
            System.out.println("Kode        : " + dosen.kode);
            System.out.println("Nama        : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia        : " + dosen.usia);
            System.out.println("------------------------------");
        }
    }

    static void jumlahDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int jumlahPria = 0, jumlahWanita = 0;
        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("\nJumlah Dosen:");
        System.out.println("Pria   : " + jumlahPria);
        System.out.println("Wanita : " + jumlahWanita);
    }
    
    static void rerataUsiaDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        System.out.println("\nRata-rata Usia Dosen:");
        System.out.println("Pria   : " + (countPria == 0 ? "Tidak ada data" : (totalUsiaPria / (double) countPria)));
        System.out.println("Wanita : " + (countWanita == 0 ? "Tidak ada data" : (totalUsiaWanita / (double) countWanita)));
    }
    static void infoDosenPalingTua(Dosen25[] arrayOfDosen) {
        Dosen25 tertua = arrayOfDosen[0];

        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("\nDosen Paling Tua:");
        System.out.println("Kode        : " + tertua.kode);
        System.out.println("Nama        : " + tertua.nama);
        System.out.println("Jenis Kelamin : " + (tertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia        : " + tertua.usia);
    }

    static void infoDosenPalingMuda(Dosen25[] arrayOfDosen) {
        Dosen25 termuda = arrayOfDosen[0];

        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("\nDosen Paling Muda:");
        System.out.println("Kode        : " + termuda.kode);
        System.out.println("Nama        : " + termuda.nama);
        System.out.println("Jenis Kelamin : " + (termuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia        : " + termuda.usia);
    }
}
