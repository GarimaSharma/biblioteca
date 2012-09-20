package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class TestCustomerManager {
    @Test
    public void customerShouldGetRegistered(){
        Customer customer;
        customer = new Customer("my name");
        CustomerManager customerManager = new CustomerManager();
        customerManager.registerCustomer(customer);
        Assert.assertTrue(customerManager.isCustomerRegistered(customer));
    }

    @Test
    public void customerShouldGetHisDetails(){
        Customer customer;
        customer = new Customer("my name");
        CustomerManager customerManager = new CustomerManager();
        customerManager.registerCustomer(customer);
        Assert.assertEquals(customer,customerManager.getDetailsOfCustomer(customer));
    }
}
