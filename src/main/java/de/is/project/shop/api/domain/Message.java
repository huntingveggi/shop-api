package de.is.project.shop.api.domain;

public interface Message {

	public Request getRequest();
	
	public void setRequest(Request request);
	
	public String getText();
	
	public void setText(String text);
	
	public boolean isRead();
	
	public void setRead(boolean isRead);
	
	public boolean isFromAdmin();
	
	public void setFromAdmin(boolean isFromAdmin);
	
}
