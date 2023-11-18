/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class PropertyOwner extends User {

    private ArrayList<String> listPropertyID = new ArrayList<>();

    public PropertyOwner(String userID, String firstName, String lastName, String email, String password, ArrayList<String> listPropertyID) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.listPropertyID = listPropertyID;
    }

    @Override
    public void setListContractID(ArrayList<String> listContractID) {

    }

    @Override
    public void setListPropertyID(ArrayList<String> listPropertyID) {
        this.listPropertyID = listPropertyID;
    }

    @Override
    public ArrayList<String> getListContractID() {
        return null;
    }

    @Override
    public ArrayList<String> getListPropertyID() {
        return listPropertyID;
    }

    @Override
    public String toString() {
        String str = "User [userID = " + userID + "; firstName = " + firstName + "; lastName = " + lastName + "; email = " + email
                + "; password = " + password;
        if (!listPropertyID.isEmpty()) {
            str += "; list of contract ID = (";
            for (int i = 0; i < listPropertyID.size(); i++) {
                str += listPropertyID.get(i) + ", ";
            }
            str += ")";
        }
        str += "]";
        return str;
    }
}
