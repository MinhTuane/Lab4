package BaseFactory;

import Model.User;

public interface BaseUserFactory {
    public User createUser(String userType);
}
