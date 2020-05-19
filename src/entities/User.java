package entities;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String id, password, name, phoneNumber;
    private static List<User> listUser = new ArrayList<>();

    public User(String id, String password, String name, String phoneNumber) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static void addUser(User user) {
        listUser.add(user);
    }

    public static List<User> getListUser() {
        return listUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
