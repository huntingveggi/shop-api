package de.is.project.shop.api.domain;

import java.util.Collection;

public interface ShoppingCart extends Visitable{
	
	public Collection<ShoppingCartPosition> getShoppingCartPositions();

	public Customer getCustomer();

	public void setCustomer(Customer customer);
	
	public double getTotal();
	
	public void setTotal(double total);
}
