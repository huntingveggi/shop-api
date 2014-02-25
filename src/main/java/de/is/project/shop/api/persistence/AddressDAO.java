package de.is.project.shop.api.persistence;

import java.util.Collection;

import de.is.project.shop.api.domain.Address;
import de.is.project.shop.api.domain.Customer;

public interface AddressDAO extends CrudDAO<Address> {

	public Collection<Address> findByCustomer(Customer customer);
}
