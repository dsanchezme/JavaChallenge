package food;

public class Sauce extends Ingredient {

    public Sauce(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
