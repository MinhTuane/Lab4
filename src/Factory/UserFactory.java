package Factory;

import java.util.Arrays;
import java.util.List;

import BaseFactory.BaseUserFactory;
import Model.Tenant;
import Model.User;

public class UserFactory implements BaseUserFactory {

    @Override
    public User createUser(String userType,List<Integer>ids) {
        User user = null;

        switch (userType.toLowerCase()) {
            case "tenant":
                user = new Tenant();
                user.updateContract(ids);
                user.addContract(1);
                break;

            default:
                break;
        }

        return user;
    }

}
