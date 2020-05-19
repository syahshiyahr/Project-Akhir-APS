package models;

import entities.Buku;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<Buku> listBuku = new ArrayList<Buku>();
    private List<Order> listOrders = new ArrayList<Order>();

    public void addBuku(Buku product) {
        listBuku.add(product);
    }

    public void addOrder(Order order) {
        listOrders.add(order);
    }

    void removeBuku(Buku product) {
        listBuku.remove(product);
    }

    public List<Buku> getAllBuku() {
        return listBuku;
    }

    public List<Order> getListOrders() {
        return listOrders;
    }

    public Buku findProductById(String id) {
        Buku p = null;
        for (Buku product : listBuku) {
            if (product.getId().equals(id)) {
                p = product;
            }
        }
        return p;
    }

}
