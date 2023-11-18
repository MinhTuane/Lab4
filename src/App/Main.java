package App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import BaseFactory.BaseContractFactory;
import BaseFactory.BasePropertyFactory;
import BaseFactory.BaseUserFactory;
import Factory.ContractFactory;
import Factory.PropertyFactory;
import Factory.UserFactory;
import Model.Manager;
import Model.Property;
import Model.PropertyOwner;
import Model.RentalContract;
import Model.Tenant;

public class Main {

	static BaseUserFactory userFactory = new UserFactory();
	static BasePropertyFactory propertyFactory = new PropertyFactory();
	static BaseContractFactory contractFactory = new ContractFactory();

	public static void main(String[] args) {

		Date now = new Date();

		Tenant tenant = (Tenant) userFactory.createUser("tenant", 111, "tenant", "tenant", "tenant@gmail.com",
				"tenant1234");
		PropertyOwner owner = (PropertyOwner) userFactory.createUser("PropertyOwner", 222, "owner", "owner",
				"owner@gmail.com",
				"owner1234");
		Manager manager = (Manager) userFactory.createUser("manager", 333, "manager", "manager", "manager@gmail.com",
				"manager1234");

		Property property = propertyFactory.createProperty(444, "ok", 10000, owner.getUserID(), -1);
		RentalContract contract = contractFactory.createContract(555, tenant.getUserID(), property.getPropertyID(), now,
				now);

		property.setContractIds(contract.getContractID());

		System.out.println(tenant);
		System.out.println(owner);
		System.out.println(manager);
		System.out.println(property);
		System.out.println(contract);
	}

}
