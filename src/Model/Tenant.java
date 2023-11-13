package Model;

import java.util.ArrayList;
import java.util.List;

import Service.TenantService;

public class Tenant extends User implements TenantService {
    private List<Integer> contractIDs = new ArrayList<>();

    public Tenant() {
    }

    public Tenant(List<Integer> contractIDs) {
        this.contractIDs = contractIDs;
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
    public void addContract(int contractID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addContract'");
    }

    @Override
    public void register(String tenantID, String firstName, String lastName, String email, String password,
            List<Integer> contractIDs) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'register'");
    }

    @Override
    public void updateProfile(String tenantID, String firstName, String lastName, String email, String password,
            List<Integer> contractIDs) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProfile'");
    }

}
