package Algoritma_dan_Struktur_Data.Praktikum03;

public class DataDosen25 {

    public void dataSemuaDosen(Dosen25[] arrayOfDosen) {
        int count = 1;
        System.out.println("Data Semua Dosen\n");
        for (Dosen25 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + count);
            System.out.println("Kode            : " + dosen.kode);
            System.out.println("Nama            : " + dosen.nama);
            System.out.println("Jenis Kelamin   : " + (dosen.jenisKelamin == true ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + dosen.usia);
            System.out.println("------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;
        for (Dosen25 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin == true) {
                pria ++;
            } else {
                wanita++;
            }
        }
        System.out.println("\nJumlah Dosen dengan jenis kelamin Pria      : " + pria);
        System.out.println("Jumlah Dosen dengan jenis kelamin Wanita    : " + wanita);
        System.out.println("------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int jmlUsiaPria = 0;
        int countPria = 0;
        int jmlUsiaWanita = 0;
        int countWanita = 0;
        for (Dosen25 dsn : arrayOfDosen) {
            if(dsn.jenisKelamin == true) {
                jmlUsiaPria += dsn.usia;
                countPria++;
            }
            else {
                jmlUsiaWanita += dsn.usia;
                countWanita++;
            }
        }
        System.out.println("\nRata-rata usia dosen Pria   : " + ((double) ((double) jmlUsiaPria / countPria)));
        System.out.println("------------------------------");
        System.out.println("Rata-rata usia dosen Wanita : " + ((double) ((double) jmlUsiaWanita / countWanita)));
        System.out.println("------------------------------");
    }

    public void infoDosenPalingTua(Dosen25[] arrayOfDosen) {
        int tertua = 0;
        for (Dosen25 dsn : arrayOfDosen) {
            int usia = dsn.usia;
            if (usia > tertua) tertua = usia;
        }
        System.out.println("\nDosen dengan Usia Tertua ");
        for (Dosen25 dsn : arrayOfDosen) {
            if (dsn.usia == tertua) {
                System.out.println("Kode            : " + dsn.kode);
                System.out.println("Nama            : " + dsn.nama);
                System.out.println("Jenis Kelamin   : " + (dsn.jenisKelamin == true ? "Pria" : "Wanita"));
                System.out.println("Usia            : " + dsn.usia);
                System.out.println("------------------------------");
            }
        }
    }

    public void infoDosenPalingMuda(Dosen25[] arrayPfDosen) {
        int termuda = 1000;
        for (Dosen25 dsn : arrayPfDosen) {
            if (dsn.usia < termuda) termuda = dsn.usia;
        }

        System.out.println("\nDosen dengan Usia Termuda");
        for (Dosen25 dsn : arrayPfDosen) {
            if (dsn.usia == termuda) {
                System.out.println("Kode            : " + dsn.kode);
                System.out.println("Nama            : " + dsn.nama);
                System.out.println("Jenis Kelamin   : " + (dsn.jenisKelamin == true ? "Pria" : "Wanita"));
                System.out.println("Usia            : " + dsn.usia);
                System.out.println("------------------------------");
            }
        }
    }
}