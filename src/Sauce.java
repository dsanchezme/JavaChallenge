public class Sauce extends Ingredient{

    public Sauce(String name) {
        super(name);
    }

    public Sauce(String name, Double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
