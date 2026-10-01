package app;

public class karyawan{
    protected String kodekaryawan;
    protected String nama;

    public karyawan(String var1, String var2) {
        this.kodekaryawan =var1;
        this.nama =var2;
    }
    public void absenPagi() {
        System.out.println(this.nama +": absen pagi");
    }

    public void kerja() {
        System.out.println(this.nama+": sedang bekerja");
    }

     public void absenPulang() {
        System.out.println(this.nama+": absen pulang");
    }
    
    public void getInfo() {
        System.out.println("Kode karyawan:" + this.kodekaryawan);
        System.out.println("Nama:"+this.nama);
    }
}