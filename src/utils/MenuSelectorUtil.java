package utils;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuSelectorUtil {

    private MenuSelectorUtil(){ }
    public static Object menuSelector(ArrayList<Object> options){
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

    public static void printWelcome(){
        System.out.println("##########################");
        System.out.println("##  Bienvenido a Subway ##");
        System.out.println("##########################");
        System.out.println("Arma tu orden!");
    }

    private static void printMenuIngredients(ArrayList<Object> options){
        int index = 1;
        for (Object option : options){
            System.out.println("\t" + index + ". " + option.toString());
            index++;
        }
        System.out.print("Selecciona una opción: ");
    }

    private static int getOption(){
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            return 0;
        }
    }

}
