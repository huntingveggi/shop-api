package de.is.project.shop.api.persistence;

import java.util.Collection;
import java.util.HashMap;

import de.is.project.shop.api.domain.Product;

public interface ProductDAO {

	Product persist(Product product);

	Product findById(int id);

	Collection<Product> findByAttributes(HashMap<String, Object> map);

	Product update(Product product);

	void delete(Product product);

}
