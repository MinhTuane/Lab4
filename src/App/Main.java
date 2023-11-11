package App;

import Model.Tenant;

public class Main {

	public static void main(String[] args) {
		Tenant tenant = new Tenant(0, "Tuan", "La", "dev@gmai.com", "pass");
		
		tenant.addRentalContract(null);
		tenant.updateProfile(null, null, null, null, null);
		tenant.login(null, null);
		tenant.register(null, null, null, null, null);
	}

}
