package de.is.project.shop.api.persistence;

public interface CrudDAO<T> {
	
	public T persist(T entity);
	
	public T findById(int id);
	
	public T update(T entity);
	
	public void delete(T entity);
	
}
