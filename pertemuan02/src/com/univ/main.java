package com.univ;

public class main {
    public static void main(String[] args) {
        // Objek pertama: Septia
        Mahasiswa Septia = new Mahasiswa(
            "4525210097",
            "Septia",
            "Rahmadhani",
            "17 september 2007",
            "Jl. Cendala No.12",
            19
        );       

        // Tampilan info
        Septia.displayInfo();

        // Panggil method belajar dan ujian
        Septia.belajar();
        Septia.ujian();

    }
}
    