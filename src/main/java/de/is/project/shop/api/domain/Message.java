package de.is.project.shop.api.domain;

public interface Message {

	public Request getRequest();
	
	public void setRequest(Request request);
	
	public String getText();
	
	public void setText(String text);
	
	public boolean getIsRead();
	
	public void setRead(boolean isRead);
	
	public boolean getIsFromAdmin();
	
	public void setFromAdmin(boolean isFromAdmin);
	
}
