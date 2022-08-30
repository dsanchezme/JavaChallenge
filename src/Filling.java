public class Filling extends Ingredient{

    private String preparation;

    public Filling(String name) {
        super(name);
    }

    public Filling(String name, Double price) {
        super(name, price);
    }

    public Filling(String name, String preparation) {
        super(name);
        this.preparation = preparation;
    }

    public Filling(String name, Double price, String preparation) {
        super(name, price);
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return this.preparation != null ? this.getName() + " " + this.preparation : this.getName();
    }
}
