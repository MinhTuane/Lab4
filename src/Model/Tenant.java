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

    @Override
    public void addContract(int contractID) {
        this.contractIDs.add(contractID);
        System.out.println("ok");
    }

    @Override
    public void updateContract(List<Integer> contracts) {
        this.contractIDs = contracts;
    }
}
