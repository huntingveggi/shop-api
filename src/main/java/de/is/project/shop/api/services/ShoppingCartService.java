package de.is.project.shop.api.services;

import de.is.project.shop.api.domain.Product;
import de.is.project.shop.api.domain.ShoppingCart;

public interface ShoppingCartService {
	
	public void addProduct(Product product);

	public void removeProduct(Product product);

	public void resetShoppingCart();
	
	public void refreshShoppingCart();
	
	/* Implement as Singleton */
	public void setShoppingCart(ShoppingCart cart);
	
	public ShoppingCart getShoppingCart();
}
