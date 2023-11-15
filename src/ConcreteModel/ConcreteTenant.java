package ConcreteModel;

import java.util.List;

import Factory.TenantFactory;
import Model.Tenant;

public class ConcreteTenant implements TenantFactory {

    @Override
    public Tenant createTenant(int userID, String firstName, String lastName, String email, String password,
            List<Integer> contractIDs) {
        return new Tenant(userID, firstName, lastName, email, password, contractIDs);
    }

}
