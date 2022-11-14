package helpers;

import store.Stock;
import food.*;

public class StockHelper {

    private static final Stock stock = new Stock();

    private StockHelper(){}
    private static void addSomeBreads(){
        Bread auxBread;
        auxBread = new Bread("Integral");
        auxBread.setLength(15);
        stock.addBread(auxBread);
        auxBread = new Bread("Integral");
        auxBread.setLength(30);
        stock.addBread(auxBread);
        auxBread = new Bread("Integral cuadrado");
        stock.addBread(auxBread);
        auxBread = new Bread("Normal");
        auxBread.setLength(15);
        stock.addBread(auxBread);
        auxBread = new Bread("Normal");
        auxBread.setLength(30);
        stock.addBread(auxBread);
        auxBread = new Bread("Normal cuadrado");
        stock.addBread(auxBread);
    }

    private static void addSomeFillings(){
        Filling auxFilling;
        auxFilling = new Filling("Pechuga de Pavo");
        auxFilling.setPrice(4000);
        stock.addFilling(auxFilling);

        auxFilling = new Filling("Pollo");
        auxFilling.setPrice(3000);
        auxFilling.setPreparation("Rostizado");
        stock.addFilling(auxFilling);

        auxFilling = new Filling("Vegetariano");
        auxFilling.setPrice(5200);
        stock.addFilling(auxFilling);

        auxFilling = new Filling("Pepperoni");
        auxFilling.setPrice(2500);
        stock.addFilling(auxFilling);

        auxFilling = new Filling("Pollo");
        auxFilling.setPrice(4500);
        auxFilling.setPreparation("Teriyaki");
        stock.addFilling(auxFilling);

        auxFilling = new Filling("Atún");
        auxFilling.setPrice(2500);
        stock.addFilling(auxFilling);

        auxFilling = new Filling("Pavo y Jamón");
        auxFilling.setPrice(5700);
        stock.addFilling(auxFilling);

        auxFilling = new Filling("Jamón");
        auxFilling.setPrice(3500);
        stock.addFilling(auxFilling);
    }

    private static void addSomeCheeses(){
        Cheese auxCheese;
        auxCheese = new Cheese("Mozarella");
        auxCheese.setPrice(700);
        stock.addCheese(auxCheese);

        auxCheese = new Cheese("Cheddar");
        auxCheese.setPrice(800);
        stock.addCheese(auxCheese);

        auxCheese = new Cheese("Chanco");
        auxCheese.setPrice(1400);
        stock.addCheese(auxCheese);

        auxCheese = new Cheese("Harvati");
        auxCheese.setPrice(2300);
        stock.addCheese(auxCheese);
    }

    private static void addSomeVeggies(){
        Veggie auxVeggie;
        auxVeggie = new Veggie("Tomate");
        auxVeggie.setPrice(400);
        stock.addVeggie(auxVeggie);

        auxVeggie = new Veggie("Lechuga");
        auxVeggie.setPrice(300);
        stock.addVeggie(auxVeggie);

        auxVeggie = new Veggie("Cebolla");
        auxVeggie.setPrice(600);
        stock.addVeggie(auxVeggie);

        auxVeggie = new Veggie("Aguacate");
        auxVeggie.setPrice(1700);
        stock.addVeggie(auxVeggie);

        auxVeggie = new Veggie("Champiñones");
        auxVeggie.setPrice(800);
        stock.addVeggie(auxVeggie);

        auxVeggie = new Veggie("Pepino");
        auxVeggie.setPrice(800);
        auxVeggie.setPreparation("Cocido");
        stock.addVeggie(auxVeggie);
    }

    private static void addSomeSauces(){
        Sauce auxSauce;
        auxSauce = new Sauce("Mayonesa con albaca");
        auxSauce.setPrice(200);
        stock.addSauce(auxSauce);

        auxSauce = new Sauce("Mostaza");
        auxSauce.setPrice(200);
        stock.addSauce(auxSauce);

        auxSauce = new Sauce("Salsa de Tomate");
        auxSauce.setPrice(200);
        stock.addSauce(auxSauce);
    }

    private static void addSomeDrinks(){
        Drink auxDrink;
        auxDrink = new Drink("Agua");
        auxDrink.setPrice(1500);
        auxDrink.setCold(true);
        auxDrink.setInBottle(true);
        stock.addDrink(auxDrink);

        auxDrink = new Drink("Jugo natural");
        auxDrink.setPrice(3000);
        stock.addDrink(auxDrink);

        auxDrink = new Drink("Gaseosa");
        auxDrink.setPrice(2500);
        stock.addDrink(auxDrink);
    }

    private static void addSomeCookies(){
        Cookie auxCookie;
        auxCookie = new Cookie("Galleta de chips");
        auxCookie.setPrice(2000);
        auxCookie.setQuantity(3);
        stock.addCookie(auxCookie);

        auxCookie = new Cookie("Galleta de chocolate");
        auxCookie.setPrice(2300);
        auxCookie.setQuantity(2);
        stock.addCookie(auxCookie);
    }

    public static Stock getSubwayStock(){
        addSomeBreads();
        addSomeFillings();
        addSomeCheeses();
        addSomeVeggies();
        addSomeSauces();
        addSomeDrinks();
        addSomeCookies();
        return stock;
    }


}
