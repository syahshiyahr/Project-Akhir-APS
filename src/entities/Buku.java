package entities;

public class Buku {

    private String id, title, author, publisher;
    private double price;

    public Buku(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Buku(String id, String title, String author, String publisher, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nProduct{" + "id=" + id + ", title=" + title + ", price=" + price + ", author=" + author + ", publisher=" + publisher + '}';
    }

}
