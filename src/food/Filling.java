package food;

public class Filling extends Ingredient{

    private String preparation;

    public Filling(String name) {
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
