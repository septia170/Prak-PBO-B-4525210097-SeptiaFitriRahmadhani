package app;

public class dosen extends karyawan {
    private String NIDN;

    public dosen(String var1, String var2, String var3) {
        super(var1, var2);
        this. NIDN = var3;
    }

    public void setNIDN(String var1) {
        this.NIDN = var1;
    }

    public void getNIDN() {
        Sytem.out.println("NIDN:" + this.NIDN);
    }

    @Override 
    public void absenPagi() {
        System.out.ptintln(this.nama + ": absen pagi");
    }

    public void mengajar() {
        System.out.println(this.nama +": sedang mengajar");
    }

    @Override public void absenPUlang() {
        System.out.println(this.nama + ": absen pulang");
    }

    @Override
    public void getInfo() {
        System.out.println("Kode karyawan:"+this.kodekaryawan);
        System.out.println("Nama: " + this.nama);
        Systemintln("NIDN: "+ this.NIDN);
    }

}