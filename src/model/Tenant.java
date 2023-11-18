/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class Tenant extends User {

    private ArrayList<String> listContractID = new ArrayList<>();

    public Tenant(String userID, String firstName, String lastName, String email, String password, ArrayList<String> listContractID) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.listContractID = listContractID;
    }

    @Override
    public void setListContractID(ArrayList<String> listContractID) {
        this.listContractID = listContractID;
    }

    @Override
    public void setListPropertyID(ArrayList<String> listPropertyID) {

    }

    @Override
    public ArrayList<String> getListContractID() {
        return listContractID;
    }

    @Override
    public ArrayList<String> getListPropertyID() {
        return null;
    }

    @Override
    public String toString() {
        String str = "User [userID = " + userID + "; firstName = " + firstName + "; lastName = " + lastName + "; email = " + email
                + "; password = " + password;
        if (!listContractID.isEmpty()) {
            str += "; list of contract ID = (";
            for (int i = 0; i < listContractID.size(); i++) {
                str += listContractID.get(i) + ", ";
            }
            str += ")";
        }
        str += "]";
        return str;
    }

}
