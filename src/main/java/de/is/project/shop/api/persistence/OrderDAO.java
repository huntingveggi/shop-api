package de.is.project.shop.api.persistence;

import java.util.Collection;

import de.is.project.shop.api.domain.Customer;
import de.is.project.shop.api.domain.Order;

public interface OrderDAO extends CrudDAO<Order>{
	
	Collection<Order> findByCustomer(Customer customer);
	
}
