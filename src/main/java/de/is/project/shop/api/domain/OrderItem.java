package de.is.project.shop.api.domain;

public interface OrderItem {
	
	public Product getProduct();
	
	public void setProduct(Product product);
	
	public int getQuantity();
	
	public void setQuantity(int quantity);
	
	public double getPrice();
	
	public void setPrice(double price);
	
	public int getReservedQuantity();
	
	public void setReservedQuantity(int reservedQuantity);
	
	public double getDiscount();
	
	public void setDiscount(double discount);
	
	public String getStatus();
	
	public void setStatus(String status);
	
}
