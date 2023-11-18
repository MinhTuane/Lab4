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
    public void addId(int id) {
        this.propertyIDs.add(id);
        System.out.println("addProperty: ok");
    }

    @Override
    public void updateIds(List<Integer> ids) {
        this.propertyIDs = ids;
    }

    @Override
    public String toString() {
        return super.toString() + "PropertyOwner [propertyIDs=" + propertyIDs + "]";
    }

}
