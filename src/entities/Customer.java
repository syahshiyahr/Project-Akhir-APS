package entities;

public class Customer extends User {

    public Customer(String id, String password, String name, String phoneNumber, String email) {
        super(id, password, name, phoneNumber);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

}
