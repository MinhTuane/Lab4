package Model;

import java.util.ArrayList;
import java.util.List;

public class PropertyOwner extends User {
    private List<Integer> propertyIDs = new ArrayList<>();

    public PropertyOwner() {
    }

    public PropertyOwner(int userID, String firstName, String lastName, String email, String password) {
        super(userID, firstName, lastName, email, password);
    }

    public List<Integer> getPropertyIDs() {
        return propertyIDs;
    }

    public void setPropertyIDs(List<Integer> propertyIDs) {
        this.propertyIDs = propertyIDs;
    }

    @Override
    public String toString() {
        return super.toString() + "PropertyOwner [propertyIDs=" + propertyIDs + "]";
    }

    @Override
    public void createProperty() {
        this.propertyIDs = new ArrayList<>();
    }

    @Override
    public List<Integer> readProperty() {
        return this.propertyIDs;
    }

    @Override
    public void updateProperty(List<Integer> properties) {
        this.propertyIDs = properties;
    }

    @Override
    public void deleteProperty(int propertyID) {
        propertyIDs.remove((Integer) propertyID);
    }

}
