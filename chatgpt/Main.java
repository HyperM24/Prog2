public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Gourmet Bistro", 10);

        if (restaurant.isTableAvailable()) {
            restaurant.placeOrder("Pizza");
        }

        restaurant.placeOrder("Pasta");

        restaurant.completeOrder("Pizza");

        System.out.println(restaurant.toString());

    }
}
