package App;

import BaseFactory.BaseUserFactory;
import Factory.UserFactory;
import Model.User;

public class Main {

	public static void main(String[] args) {
		BaseUserFactory userFactory = new UserFactory();
		User tenant = userFactory.createUser("tenant");
		System.out.println(tenant);
	}

}
