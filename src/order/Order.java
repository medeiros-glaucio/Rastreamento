package order;

import java.util.Scanner;

import order.status.Prepair;
import order.status.Status;

public class Order {
    Status status;

    public Order() {
        status = new Prepair();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void prepair() {
        status.prepair(this);
    }

    public void transport() {
        status.transport(this);
    }

    public void receive() {
        status.receive(this);
    }

    public void finish() {
        status.finish(this);
    }


    public void orderFlow() {

        this.prepair();

        this.transport();

        this.receive();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Confirma a integridade do seu pedido? (S / N)");
        String feedback = scanner.nextLine();
        
        if (feedback.equalsIgnoreCase("N")) {
            this.orderFlow();
        } else {
            this.finish();
        }
        scanner.close();
    }
}