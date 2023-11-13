package Service;

import java.util.List;

public interface TenantService {

    public void addContract(int contractID);

    public void register(String tenantID, String firstName, String lastName, String email, String password,
            List<Integer> contractIDs);

    public void updateProfile(String tenantID, String firstName, String lastName, String email, String password,
            List<Integer> contractIDs);
}