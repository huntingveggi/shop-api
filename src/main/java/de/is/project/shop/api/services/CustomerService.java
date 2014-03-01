package de.is.project.shop.api.services;

public interface CustomerService {

	public boolean activateCustomerWithKey(String activationKey);
	
	public void registerCustomer();
	
}
