package de.is.project.shop.api.domain;

import java.util.Collection;
import java.util.Date;

public interface Order extends Entity, Visitable {

	public Collection<OrderItem> getItems();
	
	public Date getOrderDate();
	
	public void setOrderDate(Date orderDate);
	
	public Customer getCustomer();
	
	public void setCustomer(Customer customer);
	
	public Address getDeliveryAddress();
	
	public void setDeliveryAddress(Address deliveryAddress);
	
	public Address getInvoiceAddress();
	
	public void setInvoiceAddress(Address invoiceAddress);
	
	public double getDiscount();
	
	public void setDiscount(double discount);
	
	public String getStatus();
	
	public void setStatus(String status);
	
	public double getTotal();
	
	public void setTotal(double total);
	
}
