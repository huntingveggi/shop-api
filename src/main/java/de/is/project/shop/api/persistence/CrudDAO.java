package de.is.project.shop.api.persistence;

import de.is.project.shop.api.domain.Customer;

public interface CrudDAO<T> {
	
	public T persist(T entity);
	
	public T findById(int id);
	
	public T update(T entity);
	
	public void delete(T entity);
	
}
