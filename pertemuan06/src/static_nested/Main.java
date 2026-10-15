package src.static_nested;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== VENDING MACHINE DEMO ===");

        //1. Membuat objek dari static Nested Class (product)
        //Bisa  langsung dibuat tanpa harus ada objek VendingMachine terlebih dahulu
        VendingMachine.Product p1 = new VendingMachine.Product(name: "Coca-Cola", price: 8000);
        VendingMachine.Product p2 = new VendingMachine.Product(name: "Potato Chips", price: 12000);
        VendingMachine.Product p3 = new VendingMachine.Product(name: "Mineral Water", price:5000);

        System.out.println("=== PRODUCT INFO ===");
        p1.displayInfo();
        p2.displayInfo();

        System.out.println("Total Products Created: " + VendingMachine.Product.getTotalProducts());
        System.out.println();

        //2. Membuat objek dari Outer Class (VendingMachine)
        VendingMachine vm1 = new VendingMachine(location: "Lobby Floor 1");
        VendingMachine vm2 = new VendingMachine(location: "cafeteria");

        System.out.println(" Vending Machines ");
        vm1.displayMachineInfo();
        vm2.displayMachineInfo();
        System.out.println();

        //3. Simulasi Pembelian
        System.out.println(" Purchase Simulation ");
        vm1.buyProduct(p1, quantity: 2);
        vm2.buyProduct(p2, quantity: 1);
        vm1.buyProduct(p3, quantity: 3);
    }
}
