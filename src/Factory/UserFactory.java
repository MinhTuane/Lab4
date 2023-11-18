package Factory;

import java.util.Arrays;
import java.util.List;

import BaseFactory.BaseUserFactory;
import Model.PropertyOwner;
import Model.Tenant;
import Model.User;

public class UserFactory implements BaseUserFactory {

    @Override
    public User createUser(String userType, List<Integer> ids) {
        User user = null;

        switch (userType.toLowerCase()) {
            case "tenant":
                user = new Tenant(0, userType, userType, userType, userType);
                user.updateIds(ids);
                user.addId(1);
                break;

            case "propertyowner":
                user = new PropertyOwner(0, userType, userType, userType, userType);
                user.updateIds(ids);
                user.addId(1);
                break;

            default:
                break;
        }

        return user;
    }

}
