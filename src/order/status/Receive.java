package order.status;

import order.Order;

public class Receive implements Status{
    @Override
    public void prepair(Order pedido) {
        pedido.setStatus(new Prepair());
        System.out.println("Pedido preparado.");
    }

    @Override
    public void transport(Order pedido) {
        System.out.println("Pedido transportado.");
    }

    @Override
    public void receive(Order pedido) {
        System.out.println("Pedido recebido.");
    }

    @Override
    public void finish(Order pedido) {
        pedido.setStatus(new Finish());
        System.out.println("Pedido finalizado.");
    }
}