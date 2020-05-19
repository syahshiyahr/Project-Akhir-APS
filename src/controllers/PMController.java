package controllers;

import entities.Buku;
import java.util.List;
import models.Order;
import models.ProductManager;

public class PMController {

    private ProductManager model;

    public PMController(ProductManager model) {
        this.model = model;
    }

    public ProductManager getmodel() {
        return model;
    }

    public void registerProduct(Buku product) {
        model.addBuku(product);
    }

    public List<Buku> getAllBuku() {
        return model.getAllBuku();
    }

    public Buku findProductById(String id) {
        return model.findProductById(id);
    }

    public Order createOrder() {
        return new Order();
    }

}
