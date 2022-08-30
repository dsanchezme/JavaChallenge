import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.System.exit;

public class App {

    private static SubwayStock subwayStock = new SubwayStock();

    private static void addSomeBreads(){
        subwayStock.addBread(new Bread("Integral", 15));
        subwayStock.addBread(new Bread("Integral", 30));
        subwayStock.addBread(new Bread("Integral cuadrado"));
        subwayStock.addBread(new Bread("Normal", 15));
        subwayStock.addBread(new Bread("Normal", 30));
        subwayStock.addBread(new Bread("Normal cuadrado"));
    }

    public static void addSomeFillings(){
        subwayStock.addFilling(new Filling("Pechuga de Pavo", 4000.0));
        subwayStock.addFilling(new Filling("Pollo", 3000.0, "Rostizado"));
        subwayStock.addFilling(new Filling("Vegetariano", 5200.0));
        subwayStock.addFilling(new Filling("Pepperoni", 2500.0));
        subwayStock.addFilling(new Filling("Pollo", 4500.0, "Teriyaki"));
        subwayStock.addFilling(new Filling("Atún", 2500.0));
        subwayStock.addFilling(new Filling("Pavo y Jamón", 5700.0));
        subwayStock.addFilling(new Filling("Jamón", 3500.0));
    }

    public static void addSomeCheeses(){
        subwayStock.addCheese(new Cheese("Mozarella", 700.0));
        subwayStock.addCheese(new Cheese("Cheddar", 800.0));
        subwayStock.addCheese(new Cheese("Chanco", 1400.0));
        subwayStock.addCheese(new Cheese("Harvati", 2300.0));
    }

    public static void addSomeVeggies(){
        subwayStock.addVeggie(new Veggie("Tomate", 400.0));
        subwayStock.addVeggie(new Veggie("Lechuga", 300.0));
        subwayStock.addVeggie(new Veggie("Cebolla", 600.0));
        subwayStock.addVeggie(new Veggie("Aguacate", 1700.0));
        subwayStock.addVeggie(new Veggie("Champiñones", 800.0));
        subwayStock.addVeggie(new Veggie("Pepino",800.0, "Cocido"));
    }

    public static void addSomeSauces(){
        subwayStock.addSauce(new Sauce("Mayonesa con albahaca", 200.0));
        subwayStock.addSauce(new Sauce("Mostaza", 200.0));
        subwayStock.addSauce(new Sauce("Salsa de Tomate", 200.0));
    }

    public static void addSomeDrinks(){
        subwayStock.addDrink(new Drink("Botella de agua", 1500.0, true, true));
        subwayStock.addDrink(new Drink("Jugo natural", 3000.0));
        subwayStock.addDrink(new Drink("Gaseosa", 2500.0));
    }

    public static void addSomeCookies(){
        subwayStock.addCookie(new Cookie("Galleta de chips", 2000.0, 3));
        subwayStock.addCookie(new Cookie("Galleta de chocolate", 2300.0, 2));
    }

    public static void addAllToStock(){
        addSomeBreads();
        addSomeFillings();
        addSomeCheeses();
        addSomeVeggies();
        addSomeSauces();
        addSomeDrinks();
        addSomeCookies();
    }

    public static void printWelcome(){
        System.out.println("##########################");
        System.out.println("##  Bienvenido a Subway ##");
        System.out.println("##########################");
    }

    public static void printMenuIngredients(ArrayList<Ingredient> options){
        int index = 1;
        for (Ingredient option : options){
            System.out.println("\t" + index + ". " + option.toString());
            index++;
        }
        System.out.print("Selecciona una opción: ");
    }

    public static Object menuSelector(ArrayList<Ingredient> options){
        int option = 0;
        while (true) {
            printMenuIngredients(options);
            option = getOption();
            if (option >= 1 && option <= options.size()) {
                return options.get(option - 1);
            } else {
                System.out.println("Selecciona un valor válido!");
            }
        }
    }

    public static int getOption(){
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            return 0;
        }
    }
    public static void makeSub(Sub sub){
        System.out.println("Pan:");
        sub.setBread((Bread)menuSelector(new ArrayList<>(subwayStock.getBreads())));

        System.out.println("Carne:");
        sub.addFilling((Ingredient) menuSelector(new ArrayList<>(subwayStock.getFillings())));
        System.out.println("Verdura:");
        sub.addFilling((Ingredient)menuSelector(new ArrayList<>(subwayStock.getVeggies())));
        System.out.println("Queso:");
        sub.addFilling((Ingredient)menuSelector(new ArrayList<>(subwayStock.getCheeses())));
        System.out.println("Salsa:");
        sub.addFilling((Ingredient)menuSelector(new ArrayList<>(subwayStock.getSauces())));

        System.out.println("Tu SUB tiene los siguientes ingredientes: ");

        for (Ingredient filling : sub.getFillings()){
            System.out.println("\t" + filling);
        }

    }

    public static void main(String[] args) throws Exception {

        addAllToStock();

        Sub sub = new Sub();

        printWelcome();
        makeSub(sub);
        sub.calculatePrice();

        System.out.println("\nTo SUB: " + sub.toString());

//        System.out.print("Enter the first numnber: ");
//        int number1 = scanner.nextInt();
//        System.out.print("Enter the second numnber: ");
//        int number2 = scanner.nextInt();

//        menuSelector(sub, new ArrayList<>(subwayStock.getBreads()));
//
//        System.out.println(sub.toString());
//        System.out.println("Selecciona el pan:");
//        printMenuIngredients(new ArrayList<>(subwayStock.getBreads()));
//        System.out.println(" ");
//        System.out.println("Selecciona el relleno:");
//        printMenuIngredients(new ArrayList<>(subwayStock.getFillings()));
//        System.out.println(" ");
//        System.out.println("Selecciona el queso:");
//        printMenuIngredients(new ArrayList<>(subwayStock.getCheeses()));
//        System.out.println(" ");
//        System.out.println("Selecciona las verduras:");
//        printMenuIngredients(new ArrayList<>(subwayStock.getVeggies()));
//        System.out.println(" ");
//        System.out.println("Selecciona las salsas:");
//        printMenuIngredients(new ArrayList<>(subwayStock.getSauces()));
//        System.out.println(" ");
//        System.out.println("Selecciona los adicionales:");
    }







}
