package com.contoh01;

public class main {
    public static void main(String[] args) {
        // objek dibuat terpisah -> kedua class independen
        dokter andi = new Dokter("Andi");
        dokter sari = new Dokter("Sari");
        Pasein budi = new Pasein("Budi");
        Pasein dina = new Pasein("Dina");

        //Membuat asosiasi (cukup dari satu sisi, sisi lain otomatis)
        andi.tambahPasien(budi);
        andi.tambahPasien(dina);
        sari.tambahPasien(budi);

        andi.periksa(budi);
        andi.tampilkanPasein();
        budi.tampilkanDokter();
    }
}
