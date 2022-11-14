import store.Client;
import store.Order;
import store.Stock;
import helpers.StockHelper;

public class Subway {
    public static void main(String[] args) {

        Stock stock = StockHelper.getSubwayStock();

        Client client = new Client("Pepe Perez");

        Order order = client.orderSub(stock);
        order.generateReceipt();

        System.out.println("\n### DETAILS ###\n");

        order.viewDetails();

    }







}
