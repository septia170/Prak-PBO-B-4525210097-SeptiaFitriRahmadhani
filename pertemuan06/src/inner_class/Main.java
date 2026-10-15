package src.inner_class;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RESTAURANT ORDER SYSTEM ===");

        // Buat Restorant
        Restaurant pizzaHut = new Restaurant("Pizza Hut", "Jl. Pizza No. 1", "021-123456");
        Restaurant KFC = new Restaurant("KFC", "Jl. Fried Chicken No. 2", "021-654321");
        pizzaHut.displayRestaurantInfo();
        KFC.displayRestaurantInfo();

        Restaurant.Order order1 = pizzaHut.createOrder("John Doe");
    }
}
