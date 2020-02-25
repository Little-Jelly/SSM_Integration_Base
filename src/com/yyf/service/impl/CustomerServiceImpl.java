package com.yyf.service.impl;

import com.yyf.dao.CustomerDao;
import com.yyf.po.Customer;
import com.yyf.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer findCustomerById(Integer id) {
        CustomerDao t = this.customerDao;
        return this.customerDao.findCustomerById(id);
    }
}
