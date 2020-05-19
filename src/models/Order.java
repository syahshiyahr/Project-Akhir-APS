package models;

import entities.Customer;
import entities.Admin;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private String invoice;
    private Customer customer;
    private List<OrderItem> orderedItems = new ArrayList<>();

    public void addOrderItem(OrderItem item) {
        orderedItems.add(item);
    }

    private double getTotal() {
        double total = 0;
        for (OrderItem item : orderedItems) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void cetakInvoice() {
        for (OrderItem item : orderedItems) {
            System.out.println("" + item.getJumlah() + " | " + item.getBuku()
                    + " | " + item.getSubtotal());
        }
        System.out.println("TOTAL " + getTotal());
    }

}
