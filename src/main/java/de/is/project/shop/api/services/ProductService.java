package de.is.project.shop.api.services;

import java.util.Collection;

import de.is.project.shop.api.domain.Product;

public interface ProductService {
	
	Collection<Product> findByCategory(String category);

	Collection<Product> findByProducer(String producer);
}