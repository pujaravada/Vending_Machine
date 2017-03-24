/**
 * Created by Puja on 3/20/17.
 */
public enum Products {
    COKE("Coke", 1.25), FANTA("Fanta",2.00), SODA("Soda",1.75), PEPSI("Pepsi", 1.50);

    String name;
    double price;

    Products(String product, double cost) {

        this.name = product;
        this.price = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

