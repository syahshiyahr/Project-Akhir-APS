package entities;

public class Admin extends User {

    private String division;

    public Admin(String id, String password, String name, String phoneNumber, String division) {
        super(id, password, name, phoneNumber);
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

}
