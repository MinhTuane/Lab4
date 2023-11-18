
public class UserFactory extends BaseUserFactory {

	@Override
	public User createUser(String s) {
		User user;
		switch(s.toLowerCase())
		{case "propertyowner":
			user = new PropertyOwner();
			break;
		case "tenant":
			user= new Tenant();
			break;
		default: throw new IllegalArgumentException("No such user.");

		}
		user.addAttribute();
		return user;
	}

}
