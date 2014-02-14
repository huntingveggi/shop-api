package de.is.project.shop.api.services;

import de.is.project.shop.api.domain.Order;
import de.is.project.shop.api.domain.Product;

/**
 * @author Stefan Stahl
 *
 */
public interface OrderService {

	public void addProduct(Product product);

	public void removeProduct(Product product);
	
	public void refreshOrder();
	
	/* Implement as Singleton */
	public void setOrder(Order order);
	
	public Order getOrder();
	
	public Order placeOrder(Order order);
	
}
