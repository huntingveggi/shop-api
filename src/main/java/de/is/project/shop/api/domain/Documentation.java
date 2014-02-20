package de.is.project.shop.api.domain;

import java.io.InputStream;

public interface Documentation {
	
	public Request getRequest();
	
	public void setRequest(Request request);
	
	public String getName();
	
	public void setName(String name);
	
	public String getDescription();
	
	public void setDescription(String description);
	
	public InputStream getPicture();

	public void setPicture(InputStream picture);

}
