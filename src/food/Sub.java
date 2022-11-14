package food;

import java.util.ArrayList;

public class Sub {
    private Bread bread;
    private ArrayList<Ingredient> fillings = new ArrayList<>();
    private ArrayList<Ingredient> additions = new ArrayList<>();
    private int price = 0;

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public ArrayList<Ingredient> getFillings() {
        return fillings;
    }

    public void addFilling(Ingredient filling) {
        this.fillings.add(filling);
    }

    public ArrayList<Ingredient> getAdditions() {
        return additions;
    }

    public void addAddition(Ingredient addition) {
        this.additions.add(addition);
    }

    public int getPrice(){
        price += fillings.stream().map(Ingredient::getPrice).mapToInt(Integer::intValue).sum();
        price += additions.stream().map(Ingredient::getPrice).mapToDouble(Integer::intValue).sum();
        return price;
    }

    @Override
    public String toString() {
        return  "\n\tPan: " + bread +
                "\n\tIngredientes: " + fillings +
                "\n\tAdicionales: " + additions +
                "\n\tPrecio: $" + price;
    }
}
