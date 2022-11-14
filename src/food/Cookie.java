package food;

public class Cookie{

    private String name;
    private int price;
    private int quantity;

    public Cookie(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.name + " (x" + this.quantity + ')';
    }
}
