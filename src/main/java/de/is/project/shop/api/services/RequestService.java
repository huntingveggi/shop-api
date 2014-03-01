package de.is.project.shop.api.services;

import de.is.project.shop.api.domain.Product;
import de.is.project.shop.api.domain.Request;

public interface RequestService {
		
	public void addProduct(Product product);

	public void removeProduct(Product product);

	public void resetRequest();
	
	public void refreshRequest();
	
	/* Implement as Singleton */
	public void setRequest(Request request);
	
	public Request getRequest();
}
