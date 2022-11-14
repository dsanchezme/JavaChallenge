package food;

public class Drink{

    private String name;
    private int price;
    private Boolean isCold;
    private Boolean inBottle;

    public Drink(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCold(Boolean cold) {
        this.isCold = cold;
    }

    public void setInBottle(Boolean inBottle) {
        this.inBottle = inBottle;
    }

    @Override
    public String toString() {

        String toPrint = Boolean.TRUE.equals(this.inBottle) ? this.name + " en botella" : this.name;
        return Boolean.TRUE.equals(this.isCold) ? toPrint + " (Frio)" : toPrint;
    }
}
