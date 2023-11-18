package Model;

import java.util.List;

public class Property {
    private int propertyID;
    private String description;
    private String rentalRate;
    private List<Integer> ownerIds;
    private List<Integer> contractIds;

    public Property() {
    }

    public Property(int propertyID, String description, String rentalRate, List<Integer> ownerIds,
            List<Integer> contractIds) {
        this.propertyID = propertyID;
        this.description = description;
        this.rentalRate = rentalRate;
        this.ownerIds = ownerIds;
        this.contractIds = contractIds;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(String rentalRate) {
        this.rentalRate = rentalRate;
    }

    public List<Integer> getOwnerIds() {
        return ownerIds;
    }

    public void setOwnerIds(List<Integer> ownerIds) {
        this.ownerIds = ownerIds;
    }

    public List<Integer> getContractIds() {
        return contractIds;
    }

    public void setContractIds(List<Integer> contractIds) {
        this.contractIds = contractIds;
    }

    @Override
    public String toString() {
        return "Property [propertyID=" + propertyID + ", description=" + description + ", rentalRate=" + rentalRate
                + ", ownerIds=" + ownerIds + ", contractIds=" + contractIds + "]";
    }

}
