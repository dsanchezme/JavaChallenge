public class Bread extends Ingredient{

    private int length;

    public Bread(String name) {
        super(name);
    }

    public Bread(String name, int length) {
        super(name);
        this.length = length;
    }

    public Bread(String name, Double price) {
        super(name, price);
    }

    public Bread(String name, Double price, int length) {
        super(name, price);
        this.length = length;
    }

    @Override
    public String toString() {

        return this.length != 0 ? this.getName() + " de " + this.length + " cm" : this.getName();
    }
}
