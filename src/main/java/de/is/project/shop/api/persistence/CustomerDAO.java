package de.is.project.shop.api.persistence;

import de.is.project.shop.api.domain.Customer;

public interface CustomerDAO extends CrudDAO<Customer> {
	
	public Customer findById(int id);
	
	public Customer findByActivationKey(String activationKey);
	
	public Customer getNewInstance();
	
}
