/**
 * YOU MADE IT TO THE END OF CHAPTER 7! 🎉
 * We've learned a lot about classes and objects in Java.... but we're not done yet! 😅
 * Inspired by the mobile game "Good Coffee, Great Coffee" ☕️☕️☕️☕️☕️
 */


// Create a new class named Order here! 💖
class Order{
    String orderName;
    String drinkName;
    double price;
    boolean isHot;
    char size;
    boolean toGo;

    public Order(String name, String drink, double Price, boolean hot, char Size, boolean out){
        orderName = name;
        drinkName = drink;
        price = Price;
        isHot = hot;
        size = Size;
        toGo = out;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new Order object here! 💖
        Order neworder = new Order("elliot","Matcha latte", 6.99, false, 'L', false);
        // Add print statements here! 💖
        System.out.println("Order for " + neworder.orderName + ": " + neworder.drinkName + " Size: " + neworder.size + " Hot? " + neworder.isHot);
        
    }


}
