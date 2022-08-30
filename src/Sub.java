import java.util.ArrayList;
import java.util.stream.Collectors;

public class Sub {
    private Bread bread;
    private ArrayList<Ingredient> fillings = new ArrayList<>();
    private ArrayList<Ingredient> additions = new ArrayList<>();;
    private Double price = 0.0;

    public Sub() {
    }

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

    public void calculatePrice(){
        price += fillings.stream().filter(ingredient -> ingredient.getPrice() != null)
                .map(ingredient -> ingredient.getPrice())
                .collect(Collectors.summingDouble(Double::doubleValue));
        price += additions.stream().filter(ingredient -> ingredient.getPrice() != null)
                .map(ingredient -> ingredient.getPrice())
                .collect(Collectors.summingDouble(Double::doubleValue));
    }


    @Override
    public String toString() {
        return  "\n\tPan: " + bread +
                "\n\tIngredientes: " + fillings +
                "\n\tAdicionales: " + additions +
                "\n\tPrecio: $" + price;
    }
}
