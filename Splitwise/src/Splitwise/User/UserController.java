package Splitwise.User;

import java.util.*;

public class UserController {
    List<User> userList;

    public UserController() {
        userList = new ArrayList<>();
    }

    public User addUser(int id, String name) {
        User newUser = new User(id, name);
        userList.add(newUser);
        return newUser;
    }

    public User getUser(int id) {
        for (User user : userList) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }

}
