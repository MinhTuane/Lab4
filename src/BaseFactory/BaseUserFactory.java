package BaseFactory;

import java.util.List;

import Model.User;

public interface BaseUserFactory {
    public User createUser(String userType,List<Integer>ids);
}
