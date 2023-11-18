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

    @Override
    public String toString() {
        return super.toString() + "Tenant [contractIDs=" + contractIDs + "]";
    }

    @Override
    public List<Integer> readContract() {
        return this.contractIDs;
    }

}
