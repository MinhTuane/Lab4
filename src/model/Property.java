/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author ASUS ROG
 */
public class Property { 
    private int propertyId;
    private PropertyOwner owner;
    private String description;
    private double rentalRate;
    private RentalContract contract;

    public Property() {
    }

    public Property(int propertyId, PropertyOwner owner, String description, double rentalRate, RentalContract contract) {
        this.propertyId = propertyId;
        this.owner = owner;
        this.description = description;
        this.rentalRate = rentalRate;
        this.contract = contract;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public PropertyOwner getOwner() {
        return owner;
    }

    public void setOwner(PropertyOwner owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public RentalContract getContract() {
        return contract;
    }

    public void setContract(RentalContract contract) {
        this.contract = contract;
    }

    public boolean createProperty() {
        return true;
    }

    public boolean updateProperty() {
        return true;
    }

    public boolean deleteProperty() {
        return true;
    }
}
