package App;

import java.util.ArrayList;
import java.util.Arrays;

import BaseFactory.BaseContractFactory;
import BaseFactory.BasePropertyFactory;
import BaseFactory.BaseUserFactory;
import Factory.ContractFactory;
import Factory.PropertyFactory;
import Factory.UserFactory;
import Model.Property;
import Model.RentalContract;
import Model.User;

public class Main {

	static BaseUserFactory userFactory = new UserFactory();
	static BasePropertyFactory propertyFactory = new PropertyFactory();
	static BaseContractFactory contractFactory = new ContractFactory();

	public static void main(String[] args) {

		User tenant = userFactory.createUser("tenant", new ArrayList<>(Arrays.asList(1, 3, 5, 4, 6, 7)));
		User owner = userFactory.createUser("propertyOwner", new ArrayList<>(Arrays.asList(1, 3, 5, 4)));
		Property property = propertyFactory.createProperty(0, null, null, null, null);
		RentalContract rentalContract = contractFactory.createContract(0, 0, 0, null, null);

		System.out.println(tenant);
		System.out.println(owner);
		System.out.println(property);
		System.out.println(rentalContract);
	}

}
