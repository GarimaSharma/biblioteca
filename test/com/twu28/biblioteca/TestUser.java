package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestUser {
    @Before
    public void setUsernameGeneratingData(){
        User.usernameGeneratingData = 1111;

    }
    @Test
    public void passwordAndUserNameCanBeChecked(){
        User user = new User("garima","garima@yahoo.com",271390,"password");
        Assert.assertTrue(user.checkPassword("1111-1111", "password"));

    }
    @Test
    public void eachTimeUsernameMustGetIncreased(){
        new User("garima","garima@yahoo.com",271390,"password");
        User user2 = new User("garima","garima@yahoo.com",271390,"password");
        Assert.assertTrue(user2.checkPassword("1111-1112","password"));
    }

}
