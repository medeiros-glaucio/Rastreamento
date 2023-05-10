package order.status;

import order.Order;

public interface Status {
    void prepair(Order order);
    void transport(Order order);
    void receive(Order order);
    void finish(Order order);
}