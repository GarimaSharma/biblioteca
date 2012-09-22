package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class TestUserManager {

    @Test
    public void loginCanBeDoneForValidInput(){
        UserManager userManager = new UserManager();
        Assert.assertTrue(userManager.login("1111-1112","password"));
    }
    @Test
    public void loginCanBeDoneForInvalidInput(){
        UserManager userManager = new UserManager();
        Assert.assertFalse(userManager.login("1111-1133", "password"));
    }
    @Test
    public void loginCanNotBeDoneForWrongPassWord(){
        UserManager userManager = new UserManager();
        Assert.assertFalse(userManager.login("1111-1111","wrong"));
    }

}
