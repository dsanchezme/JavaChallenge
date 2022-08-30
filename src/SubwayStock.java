import java.util.ArrayList;

public class SubwayStock {

    private ArrayList<Bread> breads = new ArrayList<>();
    private ArrayList<Filling> fillings = new ArrayList<>();
    private ArrayList<Cheese> cheeses = new ArrayList<>();
    private ArrayList<Veggie> veggies = new ArrayList<>();
    private ArrayList<Sauce> sauces = new ArrayList<>();
    private ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<Cookie> cookies = new ArrayList<>();

    public SubwayStock() {
    }

    public ArrayList<Bread> getBreads() {
        return breads;
    }

    public ArrayList<Filling> getFillings() {
        return fillings;
    }

    public ArrayList<Cheese> getCheeses() {
        return cheeses;
    }

    public ArrayList<Veggie> getVeggies() {
        return veggies;
    }

    public ArrayList<Sauce> getSauces() {
        return sauces;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public ArrayList<Cookie> getCookies() {
        return cookies;
    }

    public void addBread(Bread bread){
        this.breads.add(bread);
    }

    public void addFilling(Filling filling){
        this.fillings.add(filling);
    }

    public void addCheese(Cheese cheese){
        this.cheeses.add(cheese);
    }

    public void addVeggie(Veggie veggie){
        this.veggies.add(veggie);
    }

    public void addSauce(Sauce sauce){
        this.sauces.add(sauce);
    }

    public void addDrink(Drink drink){
        this.drinks.add(drink);
    }

    public void addCookie(Cookie cookie){
        this.cookies.add(cookie);
    }
}
