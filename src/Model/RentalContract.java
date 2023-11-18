package Model;

import java.util.Date;

public class RentalContract {
    private int contractID;
    private int tenantID;
    private int propertyID;
    private Date starDate;
    private Date endDate;

    public RentalContract() {
    }

    public RentalContract(int contractID, int tenantID, int propertyID, Date starDate, Date endDate) {
        this.contractID = contractID;
        this.tenantID = tenantID;
        this.propertyID = propertyID;
        this.starDate = starDate;
        this.endDate = endDate;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public int getTenantID() {
        return tenantID;
    }

    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "RentalContract [contractID=" + contractID + ", tenantID=" + tenantID + ", propertyID=" + propertyID
                + ", starDate=" + starDate + ", endDate=" + endDate + "]";
    }

}
