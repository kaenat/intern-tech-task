package eCommerce.model;

import java.util.UUID;

public class User {
    private String userID;
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.userID = UUID.randomUUID().toString();

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
