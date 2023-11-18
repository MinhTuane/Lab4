package Model;

import java.util.ArrayList;
import java.util.List;

public class Tenant extends User {
    private List<Integer> contractIDs = new ArrayList<>();

    public Tenant() {
    }

    public Tenant(int userID, String firstName, String lastName, String email, String password) {
        super(userID, firstName, lastName, email, password);
    }

    public List<Integer> getContractIDs() {
        return contractIDs;
    }

    public void setContractIDs(List<Integer> contractIDs) {
        this.contractIDs = contractIDs;
    }

    @Override
    public String toString() {
        return super.toString() + "Tenant [contractIDs=" + contractIDs + "]";
    }

    @Override
    public void addId(int contractID) {
        this.contractIDs.add(contractID);
        System.out.println("addContract: ok");
    }

    @Override
    public void updateIds(List<Integer> contracts) {
        this.contractIDs = contracts;
    }
}
