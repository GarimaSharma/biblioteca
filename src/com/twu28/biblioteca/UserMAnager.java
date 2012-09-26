package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    LibraryUsers libraryUsers = new LibraryUsers();
    List<User> registeredUsers =libraryUsers.selectALlUsers();
    public UserManager() {
        libraryUsers.addUsers(new User("garima", "garima@yahoo.com", 271390, "password"));
        libraryUsers.addUsers(new User("garima", "garima@yahoo.com", 271390, "password"));
        libraryUsers.addUsers(new User("garima", "garima@yahoo.com", 271390, "password"));
        libraryUsers.addUsers(new User("garima", "garima@yahoo.com", 271390, "password"));
        libraryUsers.addUsers(new User("garima", "garima@yahoo.com", 271390, "password"));
        libraryUsers.addUsers(new User("garima", "garima@yahoo.com", 271390, "password"));
        libraryUsers.addUsers(new User("garima", "garima@yahoo.com", 271390, "password"));
        libraryUsers.addUsers(new User("garima", "garima@yahoo.com", 271390, "password"));
        libraryUsers.addUsers(new User("garima", "garima@yahoo.com", 271390, "password"));
        libraryUsers.addUsers(new User("garima", "garima@yahoo.com", 271390, "password"));
        libraryUsers.addUsers(new User("garima", "garima@yahoo.com", 271390, "password"));
        libraryUsers.addUsers(new User("garima", "garima@yahoo.com", 271390, "password"));
    }

    public User login(String username, String password) {
        for (User user : registeredUsers) {
            if (user.checkPassword(username, password)) return user;
        }
        return null;
    }

    public String getDetailsOfUser(User userAttemptingToGetDetails) {
        for (User user : registeredUsers) {
            if (user.equals(userAttemptingToGetDetails)) return user.getDetails();

        }
        throw new RuntimeException("please login");
    }

}
