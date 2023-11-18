package Model;

import java.util.ArrayList;
import java.util.List;

public class Manager extends User {
    private List<Integer> contractIDs = new ArrayList<>();

    public Manager() {
    }

    public Manager(int userID, String firstName, String lastName, String email, String password) {
        super(userID, firstName, lastName, email, password);
    }

    public List<Integer> getContractIDs() {
        return contractIDs;
    }

    public void setContractIDs(List<Integer> contractIDs) {
        this.contractIDs = contractIDs;
    }

    @Override
    public void createContract() {
        this.contractIDs = new ArrayList<>();
    }

    @Override
    public List<Integer> readContract() {
        return this.contractIDs;
    }

    @Override
    public void updateContract(List<Integer> contracts) {
        setContractIDs(contracts);
    }

    @Override
    public void deleteContract(int contractID) {
        this.contractIDs.remove(contractID);
    }
}
