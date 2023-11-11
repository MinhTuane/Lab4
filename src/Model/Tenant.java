package Model;

import Service.TenantService;

public class Tenant extends User implements TenantService {
    private String tenantID;

    public Tenant() {
    }

    public Tenant(String tenantID) {
        this.tenantID = tenantID;
    }

    public Tenant(String userID, String firstName, String lastName, String email, String password, String tenantID) {
        super(userID, firstName, lastName, email, password);
        this.tenantID = tenantID;
    }

    public String getTenantID() {
        return tenantID;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    @Override
    public void register(String tenantID, String firstName, String lastName, String email, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'register'");
    }

    @Override
    public void updateProfile(String tenantID, String firstName, String lastName, String email, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProfile'");
    }

}
