package de.is.project.shop.api.domain;

import java.util.Collection;
import java.util.Date;

public interface Request {
	
	public Customer getCustomer();
	
	public void setCustomer();
	
	public Collection<RequestItem> getItems();
	
	public Collection<Documentation> getDocumentations();
	
	public Collection<Message> getMessages();
	
	public Date getRequestDate();
	
	public void setRequestDate(Date requestDate);
	
	public Date getDeliveryDate();
	
	public void setDeliveryDate(Date deliveryDate);
	
	public Address getDeliveryAddress();
	
	public void setDeliveryAddress(Address deliveryAddress);
	
	public double getDiscount();
	
	public void setDiscount(double discount);
	
	public String getStatus();
	
	public void setStatus(String status);
}
