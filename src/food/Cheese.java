package food;

public class Cheese extends Ingredient{

    public Cheese(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Queso " + this.getName();
    }
}
