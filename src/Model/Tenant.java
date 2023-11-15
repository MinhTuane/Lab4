package Model;

import java.util.ArrayList;
import java.util.List;

public class Tenant extends User {
    private List<Integer> contractIDs = new ArrayList<>();

    public Tenant() {
    }

    public Tenant(List<Integer> contractIDs) {
        this.contractIDs = contractIDs;
    }

    public Tenant(int userID, String firstName, String lastName, String email, String password,
            List<Integer> contractIDs) {
        super(userID, firstName, lastName, email, password);
        this.contractIDs = contractIDs;
    }

    public List<Integer> getContractIDs() {
        return contractIDs;
    }

    public void setContractIDs(List<Integer> contractIDs) {
        this.contractIDs = contractIDs;
    }

    @Override
    public String toString() {
        return "Tenant  [userID=" + this.getUserID() + ", firstName=" + this.getFirstName() +
                ", lastName=" + this.getLastName() + ", email=" + this.getEmail()
                + ", password=" + this.getPassword() + "]+contractIDs=" + contractIDs + "]";
    }

    public void updateProfile(int tenantID, String firstName, String lastName, String email, String password,
            List<Integer> contractIDs) {
        this.setUserID(tenantID);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPassword(password);
        this.setContractIDs(contractIDs);
    }

}
