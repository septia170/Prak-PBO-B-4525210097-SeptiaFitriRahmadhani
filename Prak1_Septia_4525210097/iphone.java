class iphone {
    String color;
    String storage;

    public void nyala() {System.out.println(" iphone warna" + this.color + "nyala.");}
    public void mati() {System.out.println(" iphone warna" + this.color + "mati. ");}
    public void berdering() {System.out.println(" iphone warna " + this.color + " berdering.");}
    public void videocall() {System.out.println(" iphone warna " + this.color + " videocall.");}

    public static void main(String[] agrs){
        iphone iGold = new iphone();
        iphone iGreen = new iphone();
        iphone iGrey = new iphone();
        iphone iDarkGrey = new iphone();

        iGold.color = "Gold";
        iGreen.color = "Green";
        iGrey.color = "Grey";
        iDarkGrey.color = "Dark Grey";

        iGold.storage = "64GB";
        iGreen.storage = "128GB";
        iGrey.storage = "512GB";
       iDarkGrey.storage = "64GB";
       
        System.out.println();
        iGreen.berdering();
        iDarkGrey.mati();
        iGold.nyala();
        System.out.println();
    }
}