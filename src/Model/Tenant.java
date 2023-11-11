package Model;

import java.util.ArrayList;
import java.util.List;

import Service.TenantService;

public class Tenant extends User implements TenantService {
    List<RentalContract> contracts;

    public Tenant() {
        this.contracts = new ArrayList<>();
    }

    public Tenant(List<RentalContract> contracts) {
        this.contracts = contracts;
    }

    public Tenant(int userID, String firstName, String lastName, String email, String password) {
        super(userID, firstName, lastName, email, password);
    }

    public Tenant(int userID, String firstName, String lastName, String email, String password,
            List<RentalContract> contracts) {
        super(userID, firstName, lastName, email, password);
        this.contracts = contracts;
    }

    public List<RentalContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<RentalContract> contracts) {
        this.contracts = contracts;
    }

    @Override
    public void addRentalContract(RentalContract rentalContract) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addRentalContract'");
    }

}
