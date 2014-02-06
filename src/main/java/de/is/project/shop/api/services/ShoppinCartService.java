package de.is.project.shop.api.services;

import de.is.project.shop.api.domain.Product;
import de.is.project.shop.api.domain.ShoppingCart;

public interface ShoppinCartService {
	
	public void addProduct(Product product);

	public void removeProduct(Product product);

	public void resetShoppingCart();
	
	/* Implement as Singleton */
	public void setShoppingCart(ShoppingCart cart);
}
