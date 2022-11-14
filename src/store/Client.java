package store;

import food.*;

import java.util.ArrayList;
import java.util.Arrays;

import static utils.MenuSelectorUtil.*;

public class Client {

    private final String name;

    public Client(String name) {
        this.name = name;
    }

    public Order orderSub(Stock stock){

        printWelcome();

        ArrayList<Sub> subs = new ArrayList<>();
        ArrayList<Drink> drinks = new ArrayList<>();
        ArrayList<Cookie> cookies = new ArrayList<>();

        ArrayList<Object> generalMenuOptions = new ArrayList<>();
        generalMenuOptions.add("Subs");
        generalMenuOptions.add("Bebidas");
        generalMenuOptions.add("Galletas");
        generalMenuOptions.add("Finalizar");

        String option;

        do {
            option = menuSelector(generalMenuOptions).toString();
            switch (option){
                case "Subs":
                    Sub sub = new Sub();
                    System.out.println("Arma tu sub!");
                    System.out.println("Pan:");
                    sub.setBread((Bread)menuSelector(new ArrayList<>(stock.getBreads())));
                    System.out.println("Carne:");
                    sub.addFilling((Ingredient) menuSelector(new ArrayList<>(stock.getFillings())));
                    System.out.println("Verdura:");
                    sub.addFilling((Ingredient)menuSelector(new ArrayList<>(stock.getVeggies())));
                    System.out.println("Queso:");
                    sub.addFilling((Ingredient)menuSelector(new ArrayList<>(stock.getCheeses())));
                    System.out.println("Salsa:");
                    sub.addFilling((Ingredient)menuSelector(new ArrayList<>(stock.getSauces())));
                    System.out.println("¿Deseas adicionales?");
                    Boolean withAdditions = menuSelector(new ArrayList<>(Arrays.asList("Si", "No"))).toString().equals("Si");
                    if (Boolean.TRUE.equals(withAdditions)){
                        String addition;
                        do {
                            addition = menuSelector(new ArrayList<>(Arrays.asList("Verdura", "Queso", "Salsa", "Listo!"))).toString();
                            switch (addition){
                                case "Verdura":
                                    System.out.println("Verdura:");
                                    sub.addAddition((Ingredient)menuSelector(new ArrayList<>(stock.getVeggies())));
                                    break;
                                case "Queso":
                                    System.out.println("Queso:");
                                    sub.addAddition((Ingredient)menuSelector(new ArrayList<>(stock.getCheeses())));
                                    break;
                                case "Salsa":
                                    System.out.println("Salsa:");
                                    sub.addAddition((Ingredient)menuSelector(new ArrayList<>(stock.getSauces())));
                                    break;
                                case "Listo!":
                                    break;
                                default:
                                    System.out.println("Selecciona una opción válida!");
                            }
                        } while (!addition.equals("Listo!"));
                    }
                    subs.add(sub);
                    break;
                case "Bebidas":
                    System.out.println("Elige tu bebida preferida!");
                    System.out.println("Bebidas:");
                    Drink drink = (Drink)menuSelector(new ArrayList<>(stock.getDrinks()));
                    drinks.add(drink);
                    break;
                case "Galletas":
                    System.out.println("Elige tu galleta preferida!");
                    System.out.println("Galletas:");
                    Cookie cookie = (Cookie)menuSelector(new ArrayList<>(stock.getCookies()));
                    cookies.add(cookie);
                    break;
                case "Finalizar":
                    System.out.println("Has finalizado tu orden!");
                    break;
                default:
                    System.out.println("Selecciona una opción válida!");
            }
        }
        while (!option.equals("Finalizar"));

        Order order = new Order();
        order.setClient(this.name);
        order.setSubs(subs);
        order.setDrinks(drinks);
        order.setCookies(cookies);

        return order;
    }
}
