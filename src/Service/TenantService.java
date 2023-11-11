package Service;

public interface TenantService {
    public void register(String tenantID, String firstName, String lastName, String email, String password);

    public void updateProfile(String tenantID, String firstName, String lastName, String email, String password);
}