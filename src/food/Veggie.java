package food;

public class Veggie extends Ingredient {

    private String preparation;

    public Veggie(String name) {
        super(name);
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return this.preparation != null ? this.getName() + " " + this.preparation : this.getName();
    }
}
