package Factory;

import java.util.List;

import Model.Tenant;

public interface TenantFactory {
    Tenant createTenant(int userID, String firstName, String lastName, String email, String password,
            List<Integer> contractIDs);
}
