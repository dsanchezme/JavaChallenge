package food;

public class Bread extends Ingredient{

    private int length;

    public Bread(String name) {
        super(name);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return this.length != 0 ? this.getName() + " de " + this.length + " cm" : this.getName();
    }
}
