package App;

import java.util.List;

import ConcreteModel.ConcreteTenant;
import ConcreteModel.ConcreteUser;
import Factory.TenantFactory;
import Factory.UserFactory;
import Model.Tenant;
import Model.User;

public class Main {

	public static void main(String[] args) {
		UserFactory userFactory = new ConcreteUser();
		User user = userFactory.creatUser(1, "John", "Doe", "john.doe@example.com", "password");

		System.out.println(user);

		TenantFactory tenantFactory = new ConcreteTenant();
		Tenant tenant = tenantFactory.createTenant(2, "Jane", "Doe", "jane.doe@example.com", "password",
				List.of(101, 102, 103));

		System.out.println(tenant);
		
		tenant.updateProfile(2, "Jane", "Doe", "jane.doe@example.com", "newpassword", List.of(104, 105));
		
		System.out.println(tenant);

		boolean loginResult = user.login("john.doe@example.com", "password");
		boolean resetPasswordResult = user.resetPassword("newpassword");

		System.out.println("Login Result: " + loginResult);
		System.out.println("Password Reset Result: " + resetPasswordResult);
	}

}
