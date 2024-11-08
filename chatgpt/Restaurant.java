import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String restaurantName;
    private int tables;
    private int availableTables;
    private List<String> orders;

    public Restaurant(String restaurantName, int tables) {
        this.restaurantName = restaurantName;
        this.tables = tables;
        this.availableTables = tables;
        this.orders = new ArrayList<String>();
    }

    public void placeOrder(String orderName) {
        if (this.availableTables > 0) {
            orders.add(orderName);
            availableTables--;
        } else {
            System.out.println("Nincs elerheto asztal a rendeleshez");
        }

    }

    public void completeOrder(String orderName) {
        if (orders.contains(orderName)) {
            orders.remove(orderName);
            availableTables++;
        } else {
            System.out.println("A rendeles nem talalhato.");
        }
    }

    public boolean isTableAvailable() {
        return this.availableTables > 0;
    }

    public String getRestaurantName() {
        return this.restaurantName;
    }

    public int getTables() {
        return this.tables;
    }

    public int getAvailableTables() {
        return this.availableTables;
    }

    public List<String> getOrders() {
        return orders;
    }

    @Override

    public String toString() {

        return String.format(
                """
                        Etterem adatai:
                        -Nev: %s
                        -Osszes asztal: %d
                        -Szabad asztalok: %d
                        -Rendelesek:  %s""",
                this.restaurantName,
                this.tables,
                this.availableTables,
                this.orders.isEmpty() ? "Jelenleg nincs rendeles" : String.join(", ", this.orders));

    }

}
