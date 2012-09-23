package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.xml.ws.BindingType;

public class TestUserManager {

    @Before
    public void setUsernameGeneratingData(){
        User.usernameGeneratingData = 1111;
    }
    @Test
    public void loginCanBeDoneForValidInput(){
        UserManager userManager = new UserManager();
        Assert.assertNotNull(userManager.login("1111-1112","password"));
    }
    @Test
    public void loginCanBeDoneForInvalidInput(){
        UserManager userManager = new UserManager();
        Assert.assertNull(userManager.login("1111-1133", "password"));
    }
    @Test
    public void loginCanNotBeDoneForWrongPassWord(){
        UserManager userManager = new UserManager();
        Assert.assertNull(userManager.login("1111-1111","wrong"));
    }
    @Test  (expected = RuntimeException.class)
    public void detailsCanBeSeenOfUser(){
        User user;
        UserManager userManager = new UserManager();
        user= userManager.login("1111-1111","password");
        Assert.assertEquals("garima  garima@yahoo.com  271390",userManager.getDetailsOfUser(user));
    }
    @Test
    public void exceptionGetsGeneratedIfDetailsAreAskedBeforeLogin(){
        User user =null;
        UserManager userManager = new UserManager();
        Assert.assertEquals("garima  garima@yahoo.com  271390",userManager.getDetailsOfUser(user));
    }

}
