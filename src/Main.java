import java.util.Scanner;

import order.Order;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rastrear pedido? (S / N)");
        String answer = scanner.nextLine();        

        if (!answer.equalsIgnoreCase("S")) {
        	System.out.println();
            System.out.println("Até logo!");
            return;
        }        
        
        System.out.println();
        System.out.println("Rastreando pedido...");
        System.out.println();
        Order order = new Order();
        order.orderFlow();
        scanner.close();
    }
}