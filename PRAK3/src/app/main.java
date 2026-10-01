package app;

public class main {
    public static void main(String[] args) throws Exception {
        karyawan Tika = new karyawan("12345", "Tika");
        Tika.getInfo();
        Tika.absenPagi();
        Tika.kerja();
        Tika.absenPulang();

        System.out.println();

        karyawan Melan = new karyawan ("12346", "Melan");
        Melan.getInfo();
        Melan.absenPagi();
        Melan.kerja();
        Melan.absenPulang();

        System.out.println();

        dosen Andiani = new dosen("23455", "Andiani", "332211");
        Andiani.getInfo();
        Andiani.absenPagi();
        Andiani.mengajar();
        Andiani.absenPulang();

        System.out.println();

       dosen Ionia = new dosen("45254", "Ionia", "24454");
        Ionia.getInfo();
        Ionia.absenPagi();
        Ionia.mengajar();
        Ionia.absenPulang();

    }
}
