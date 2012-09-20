package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomerManager {

    HashMap<Customer,Integer> reegisteredCustomers = new HashMap<Customer, Integer>();

    public void registerCustomer(Customer customer) {
        reegisteredCustomers.put(customer,customer.hashCode());
    }

    public boolean isCustomerRegistered(Customer customer) {
        return reegisteredCustomers.containsKey(customer);

    }

    public Customer getDetailsOfCustomer(Customer customer) {
        if (isCustomerRegistered(customer)) return customer;
        throw new RuntimeException("unregistered customer");
    }
}
