package com.lti.crm.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.crm.dao.CustomerDAO;
import com.lti.crm.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
@Autowired
private CustomerDAO customerDAO;

@Transactional
public List<Customer> getCustomers() {
	// TODO Auto-generated method stub
	return customerDAO.getCustomers();
}

@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
	 customerDAO.saveCustomer(theCustomer);
	}

public Customer getCustomer(int theId) {
	// TODO Auto-generated method stub
	return customerDAO.getCustomer(theId) ;
}

}
















