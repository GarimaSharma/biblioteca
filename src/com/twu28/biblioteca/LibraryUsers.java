package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class LibraryUsers {
    List<User> users = new ArrayList<User>();
    public void addUsers(User user){
        users.add(user);
    }
    public List<User> selectALlUsers(){
        return users;
    }

}
