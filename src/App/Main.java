package App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import BaseFactory.BaseUserFactory;
import Factory.UserFactory;
import Model.User;

public class Main {

	public static void main(String[] args) {
		BaseUserFactory userFactory = new UserFactory();
		List ids = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 6, 7));
		User tenant = userFactory.createUser("tenant", ids);
		System.out.println(tenant);
	}

}
