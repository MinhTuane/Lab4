package Factory;

import BaseFactory.BaseUserFactory;
import Model.Manager;
import Model.PropertyOwner;
import Model.Tenant;
import Model.User;

public class UserFactory implements BaseUserFactory {

    @Override
    public User createUser(String userType, int userID, String firstName, String lastName, String email,
            String password) {
        User user = null;

        switch (userType.toLowerCase()) {
            case "tenant":
                user = new Tenant(userID, firstName, lastName, email, password);
                break;

            case "propertyowner":
                user = new PropertyOwner(userID, firstName, lastName, email, password);
                break;
            case "manager":
                user = new Manager(userID, firstName, lastName, email, password);
                break;
            default:
                break;
        }

        return user;
    }

}
