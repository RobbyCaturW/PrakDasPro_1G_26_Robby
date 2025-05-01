package Algoritma_dan_Struktur_Data.Praktikum05;

public class DataDosen25 {
    Dosen25[] dataDosen = new Dosen25[10];
    int idx;

    void tambah(Dosen25 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh");
        }
    }

    void tampil() {
        for (Dosen25 dsn : dataDosen) {
            dsn.tampil();
            System.out.println("------------------------------------");
        }
    }

    void SortingASC() {
        for (int i = 0; i < dataDosen.length-1; i++) {
            for (int j = 1; j < dataDosen.length-i; j++) {
                if (dataDosen[j].usia < dataDosen[j-1].usia) {
                    Dosen25 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < dataDosen.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[idxMin].usia) {
                    idxMin = j;
                } 
            }

            Dosen25 tmp = dataDosen[idxMin];
            dataDosen[idxMin] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 0; i < dataDosen.length; i++) {
            Dosen25 temp = dataDosen[i];
            int j = i;
            while (j>0 && dataDosen[j-1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    void PencarianDataSequential25(String nama) {
        boolean isFound = false;
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                isFound = true;
                count++;
                System.out.println("Dosen ditemukan pada indeks " + i);
                dataDosen[i].tampil();
                System.out.println("------------------------------------");
            }
        }
        if (!isFound) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama " + nama + "!");
            System.out.println();
        }
    }

    void PencarianDataBinary25(int usia) {
        SortingASC();
        int l = 0, r = idx - 1, count = 0;
        boolean isFound = false;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (dataDosen[mid].usia == usia) {
                isFound = true;
                System.out.println("Dosen ditemukan pada indeks " + mid);
                dataDosen[mid].tampil();
                count++;
                
                int temp = mid - 1;
                while (temp >= 0 && dataDosen[temp].usia == usia) {
                    System.out.println("Dosen ditemukan pada indeks " + temp);
                    dataDosen[temp].tampil();
                    count++;
                    temp--;
                    System.out.println("------------------------------------");
                }
                
                int temp2 = mid + 1;
                while (temp2 < idx && dataDosen[temp2].usia == usia) {
                    System.out.println("Dosen ditemukan pada indeks " + temp2);
                    dataDosen[temp2].tampil();
                    count++;
                    temp2++;
                }
                break;
            } else if (dataDosen[mid].usia < usia) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        
        if (!isFound) {
            System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia " + usia + " tahun!");
            System.out.println();
        }
    }
}