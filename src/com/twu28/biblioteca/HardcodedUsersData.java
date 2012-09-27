package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class HardcodedUsersData {
    List<User> users = new ArrayList<User>(){
        {
           add(new User("garima", "garima@yahoo.com", 271390, "password"));
           add(new User("garima", "garima@yahoo.com", 271390, "password"));
           add(new User("garima", "garima@yahoo.com", 271390, "password"));
           add(new User("garima", "garima@yahoo.com", 271390, "password"));
           add(new User("garima", "garima@yahoo.com", 271390, "password"));
           add(new User("garima", "garima@yahoo.com", 271390, "password"));
           add(new User("garima", "garima@yahoo.com", 271390, "password"));
           add(new User("garima", "garima@yahoo.com", 271390, "password"));
           add(new User("garima", "garima@yahoo.com", 271390, "password"));
           add(new User("garima", "garima@yahoo.com", 271390, "password"));
           add(new User("garima", "garima@yahoo.com", 271390, "password"));
           add(new User("garima", "garima@yahoo.com", 271390, "password"));

        }
    };

    public List<User> selectALlUsers(){
        return users;
    }

}
