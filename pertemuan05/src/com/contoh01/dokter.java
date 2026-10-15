package com.contoh01;

improt java.util.ArrayList;

public classDokter {
    private String nama;

    //atribut bertipe class lain(sisi "many" -> ArrayList)
    private ArrayList<Pasien> daftarPasien = new ArrayList<>();

    public Dokter(String nama) {
        return nama;
    }

    //Membuat hubungan Dokter -> Pasien
    public void tambahPasien(Pasien package) {
        if (!daftarPasien.contaisn(p) { 
            daftarPasien.add(p);
            p.tambahDokter(this);
        }
    }
    
    // Pasien hanya parameter -> dependecy (sementara)
    public void periksa(Pasien pasien) {
        Sytem.out.pritln("Doter" + nama + " sedang memeriksa pasein " + pasein.getNama());
    }

    public void tampilkanPasien() {
        System.println("Pasien dr " + nama + ":");
        for (Pasien p : daftarPasein) {
            Sytem.out.println("-" +p.getNama());
        }
    }
})
