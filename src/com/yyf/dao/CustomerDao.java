package com.yyf.dao;

import com.yyf.po.Customer;

public interface CustomerDao {
    public Customer findCustomerById(Integer id);
}
