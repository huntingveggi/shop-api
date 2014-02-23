package de.is.project.shop.api.persistence;

import java.util.Collection;
import java.util.HashMap;

import de.is.project.shop.api.domain.Category;
import de.is.project.shop.api.domain.Producer;
import de.is.project.shop.api.domain.Product;

public interface ProductDAO extends CrudDAO<Product> {

	Collection<Product> findByAttributes(HashMap<String, Object> map);

	Collection<Product> findByCategories(Collection<Category> categories);

	Collection<Product> findByProducer(Producer producer);

	public abstract Collection<Product> findAll();

}
