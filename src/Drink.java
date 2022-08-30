public class Drink{

    private String name;
    private Double price;
    private Boolean isCold;
    private Boolean inBottle;
    private Double quantity;
    private String units;

    public Drink(String name) {
        this.name = name;
    }

    public Drink(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Drink(String name, Double price, Boolean isCold, Boolean inBottle) {
        this.name = name;
        this.price = price;
        this.isCold = isCold;
        this.inBottle = inBottle;
    }

    public Drink(String name, Double price, Boolean isCold, Boolean inBottle, Double quantity, String units) {
        this.name = name;
        this.price = price;
        this.isCold = isCold;
        this.inBottle = inBottle;
        this.quantity = quantity;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getCold() {
        return isCold;
    }

    public void setCold(Boolean cold) {
        isCold = cold;
    }

    public Boolean getInBottle() {
        return inBottle;
    }

    public void setInBottle(Boolean inBottle) {
        this.inBottle = inBottle;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
