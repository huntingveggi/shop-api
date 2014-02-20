package de.is.project.shop.api.domain;

public interface RequestItem {

	public Request getRequest();
	
	public void setRequest();
	
	public Product getProduct();
	
	public void setProduct(Product product);
	
	public int getQuantity();
	
	public void setQuantity();
	
	public double getPrice();
	
	public void setPrice(double price);
	
	public double getDiscount();
	
	public void setDiscount(double discount);
}
