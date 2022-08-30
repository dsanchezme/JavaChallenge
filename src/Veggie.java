public class Veggie extends Ingredient{

    private String preparation;

    public Veggie(String name) {
        super(name);
    }

    public Veggie(String name, Double price) {
        super(name, price);
    }

    public Veggie(String name, String preparation) {
        super(name);
        this.preparation = preparation;
    }

    public Veggie(String name, Double price, String preparation) {
        super(name, price);
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return this.preparation != null ? this.getName() + " " + this.preparation : this.getName();
    }
}
