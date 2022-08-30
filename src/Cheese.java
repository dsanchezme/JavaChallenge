public class Cheese extends Ingredient{

    public Cheese(String name) {
        super(name);
    }

    public Cheese(String name, Double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Queso " + this.getName();
    }
}
