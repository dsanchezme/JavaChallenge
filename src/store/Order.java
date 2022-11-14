package store;

import food.Cookie;
import food.Drink;
import food.Ingredient;
import food.Sub;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Order {
    private String id;
    private String client;
    private ArrayList<Sub> subs;
    private ArrayList<Drink> drinks;
    private ArrayList<Cookie> cookies;

    public Order(){
        this.id = UUID.randomUUID().toString().substring(0,8);
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setSubs(ArrayList<Sub> subs) {
        this.subs = subs;
    }

    public void setDrinks(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    public ArrayList<Cookie> getCookies() {
        return cookies;
    }

    public void setCookies(ArrayList<Cookie> cookies) {
        this.cookies = cookies;
    }

    public void generateReceipt(){

        Date date = new Date();
        int totalPrice = 0;

        System.out.println("--------------------------");
        System.out.println("          SUBWAY");
        System.out.println("--------------------------");
        System.out.println("--- Orden No. " + id);
        System.out.println("--- " + date);
        System.out.println("--- " + client);
        System.out.println("--------------------------");
        System.out.println("---------- SUBS ----------");
        for (Sub sub : subs){
            int subPrice = sub.getPrice();
            System.out.println("--- Sub de " + sub.getFillings().get(0) + "  -- $" + subPrice);
            if (!sub.getAdditions().isEmpty())
                System.out.println("    > Additions: ");
            for (Ingredient addition : sub.getAdditions()){
                System.out.println("       " + addition.getName() + "  -- $" + addition.getPrice());
                subPrice += addition.getPrice();
            }
            totalPrice += subPrice;
        }
        System.out.println("-------- BEBIDAS --------");
        for (Drink drink : drinks){
            int drinkPrice = drink.getPrice();
            System.out.println("--- " + drink.toString() + "  -- $" + drinkPrice);
            totalPrice += drinkPrice;
        }
        System.out.println("-------- GALLETAS --------");
        for (Cookie cookie : cookies){
            int cookiePrice = cookie.getPrice();
            System.out.println("--- " + cookie.toString() + "  -- $" + cookiePrice);
            totalPrice += cookiePrice;
        }
        System.out.println("--------------------------");
        System.out.println("--- TOTAL - $" + totalPrice);
        System.out.println("--------------------------");
    }

    public void viewDetails(){
        System.out.println("Subs:");
        for (Sub sub : subs){
            System.out.println(" > " + sub);
        }
        System.out.println("Bebidas:");
        for (Drink drink : drinks){
            System.out.println(" > " + drink);
        }
        System.out.println("Galletas:");
        for (Cookie cookie : cookies){
            System.out.println(" > " + cookie);
        }
    }
}
