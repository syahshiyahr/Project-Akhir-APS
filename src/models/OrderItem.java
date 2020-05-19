package models;

import entities.Buku;

public class OrderItem {

    private Buku buku;
    private int jumlah;

    public OrderItem(Buku buku, int jumlah) {
        this.buku = buku;
        this.jumlah = jumlah;
    }

    public Buku getBuku() {
        return buku;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getSubtotal() {
        return buku.getPrice() * jumlah;
    }

}
