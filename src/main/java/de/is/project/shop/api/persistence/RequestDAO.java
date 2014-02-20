package de.is.project.shop.api.persistence;

import java.util.Collection;

import de.is.project.shop.api.domain.Customer;
import de.is.project.shop.api.domain.Request;

public interface RequestDAO extends CrudDAO<Request> {
	
	Request findById(int id);
	
	Collection<Request> findByCustomer(Customer customer);
	
}
