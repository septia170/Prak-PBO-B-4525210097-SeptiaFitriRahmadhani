class hewan {
    String color;
    String storage;

    public void terbang() {System.out.println(" hewan burung" + this.color + "terbang.");}
    public void berjalan() {System.out.println(" hewan anjing" + this.color + "berjalan. ");}
    public void berjalan() {System.out.println(" hewan kucing " + this.color + " berjalan.");}

    public static void main(String[] agrs){
        iphone iWhite = new hewan();
        iphone iBlack = new hewan();
        iphone iGrey = new hewan();

        iWhite.color = "White";
        iBlack.color = "Black";
        iGrey.color = "Grey";
       
        System.out.println();
        iWhite.terbang();
        iBlack.berjalan();
        iGrey.berjalan();
        System.out.println();
    }
}