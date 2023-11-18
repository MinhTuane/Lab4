package Model;

public class Property {
    private int propertyID;
    private String description;
    private double rentalRate;
    private int contractId;
    private int ownerId;

    public Property() {
    }

    public Property(int propertyID, String description, double rentalRate, int ownerIds,
            int contractIds) {
        this.propertyID = propertyID;
        this.description = description;
        this.rentalRate = rentalRate;
        this.ownerId = ownerIds;
        this.contractId = contractIds;
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

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerIds) {
        this.ownerId = ownerIds;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractIds(int contractIds) {
        this.contractId = contractIds;
    }

    @Override
    public String toString() {
        return "Property [propertyID=" + propertyID + ", description=" + description + ", rentalRate=" + rentalRate
                + ", ownerIds=" + ownerId + ", contractIds=" + contractId + "]";
    }

}
