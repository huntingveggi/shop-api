package de.is.project.shop.api.domain;

import java.util.Date;

public interface Message extends Entity{

	public Request getRequest();
	
	public void setRequest(Request request);
	
	public String getText();
	
	public void setText(String text);
	
	public boolean isRead();
	
	public void setRead(boolean isRead);
	
	Date getMessageDate();
	
	public Customer getCustomer();
	
	public void setCustomer(Customer customer);
	
	public void setMessageDate(Date messageDate);
	
}
