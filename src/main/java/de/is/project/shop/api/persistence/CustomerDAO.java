package de.is.project.shop.api.persistence;

import java.util.Collection;

import de.is.project.shop.api.domain.Address;
import de.is.project.shop.api.domain.Customer;

public interface CustomerDAO extends CrudDAO<Customer> {
	
	public Collection<Address> getCustomersAddresses(Customer customer);
	
	public Customer findById(int id);
	
}
