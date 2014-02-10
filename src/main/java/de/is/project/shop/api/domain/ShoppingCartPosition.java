package de.is.project.shop.api.domain;

public interface ShoppingCartPosition {
	
	public Product getProduct();

	public void setProduct(Product product);

	public int getQuantity();

	public void setQuantity(int quantity);
	
	public double getTotal();
	
	public void setTotal(double total);
}
