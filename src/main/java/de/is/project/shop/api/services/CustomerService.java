package de.is.project.shop.api.services;

import de.is.project.shop.api.domain.Customer;

public interface CustomerService {

	public boolean activateCustomerWithKey(String activationKey);
	
	public void registerCustomer();

	/* Implement as Singleton */
	public void setCustomer(Customer customer);
}
