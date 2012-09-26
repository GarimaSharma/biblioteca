package com.twu28.biblioteca;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

public class TestLibraryUsers{
    @Test
    public void usersCanBeAdded() {
        LibraryUsers libraryUsers = new LibraryUsers();
        User user = new User("garima","garima@yahoo.com",271390,"password");
        libraryUsers.addUsers(user);
        Assert.assertEquals(user,(libraryUsers.selectALlUsers()).get(0));


    }
    @Test
     public void usersCanBeSelected(){
        LibraryUsers libraryUsers = new LibraryUsers();
        User user = new User("garima","garima@yahoo.com",271390,"password");
        User user1 = new User("garima","garima@yahoo.com",271390,"password");
        User user2 = new User("garima","garima@yahoo.com",271390,"password");
        libraryUsers.addUsers(user);
        libraryUsers.addUsers(user1);
        libraryUsers.addUsers(user2);
        Assert.assertEquals(user,(libraryUsers.selectALlUsers()).get(0));
        Assert.assertEquals(user1,(libraryUsers.selectALlUsers()).get(1));
        Assert.assertEquals(user2,(libraryUsers.selectALlUsers()).get(2));
    }
}
