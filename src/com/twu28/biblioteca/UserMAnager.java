package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    List<User> registeredUsers = new ArrayList<User>();
    public UserManager(){
        registeredUsers.add(new User("garima","garima@yahoo.com",271390,"password"));
        registeredUsers.add(new User("garima","garima@yahoo.com",271390,"password"));
        registeredUsers.add(new User("garima","garima@yahoo.com",271390,"password"));
        registeredUsers.add(new User("garima","garima@yahoo.com",271390,"password"));
        registeredUsers.add(new User("garima","garima@yahoo.com",271390,"password"));
        registeredUsers.add(new User("garima","garima@yahoo.com",271390,"password"));
        registeredUsers.add(new User("garima","garima@yahoo.com",271390,"password"));
        registeredUsers.add(new User("garima","garima@yahoo.com",271390,"password"));
        registeredUsers.add(new User("garima","garima@yahoo.com",271390,"password"));
        registeredUsers.add(new User("garima","garima@yahoo.com",271390,"password"));
        registeredUsers.add(new User("garima","garima@yahoo.com",271390,"password"));
        registeredUsers.add(new User("garima","garima@yahoo.com",271390,"password"));
    }

    public boolean login(String username, String password) {
        for (User user : registeredUsers) {
            if(user.checkPassword(username,password))return true;
        }
        return false;
    }
}
