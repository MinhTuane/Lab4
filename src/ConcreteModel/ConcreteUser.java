package ConcreteModel;

import Factory.UserFactory;
import Model.User;

public class ConcreteUser implements UserFactory {

    @Override
    public User creatUser(int userID, String firstName, String lastName, String email, String password) {
        return new User(userID, firstName, lastName, email, password);
    }

}
