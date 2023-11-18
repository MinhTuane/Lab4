package BaseFactory;

import Model.User;

public interface BaseUserFactory {
    public User createUser(String userType,int userID, String firstName, String lastName, String email, String password);
}
