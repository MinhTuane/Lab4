package Factory;

import Model.User;

public interface UserFactory {
    User creatUser(int userID, String firstName, String lastName, String email, String password);
}
