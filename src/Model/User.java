package Model;

import java.util.List;

public abstract class User {
    private int userID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User() {
    }

    public User(int userID, String firstName, String lastName, String email, String password) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", password=" + password + "]";
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public boolean resetPassword(String newPassword) {
        this.password = newPassword;
        return true;
    }

    public void updateProfile(int userID, String firstName, String lastName, String email, String password) {
        setUserID(userID);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
    };

    public abstract void addContract(int contractID);

    public abstract void updateContract(List<Integer> contracts);

}
