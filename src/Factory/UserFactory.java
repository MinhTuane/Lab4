package Factory;

import BaseFactory.BaseUserFactory;
import Model.Tenant;
import Model.User;

public class UserFactory implements BaseUserFactory {

    @Override
    public User createUser(String userType) {
        User user = null;

        switch (userType.toLowerCase()) {
            case "tenant":
                user = new Tenant();
                user.addContract(1);
                break;

            default:
                break;
        }

        return user;
    }

}
