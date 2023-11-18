/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ASUS ROG
 */
public abstract class User {
    String userID;
    String firstName;
    String lastName;
    String email;
    String password;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
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

    public abstract String toString();

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public boolean resetPassword(String newPassword) {
        this.password = newPassword;
        return true;
    }
    
    public abstract ArrayList<String> getListContractID();
    
    public abstract ArrayList<String> getListPropertyID();
    
    public abstract void setListContractID(ArrayList<String> listContractID);

    public abstract void setListPropertyID(ArrayList<String> listPropertyID);
}
