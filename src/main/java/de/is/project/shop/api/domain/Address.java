package de.is.project.shop.api.domain;


public interface Address extends Entity{
	
	public Customer getCustomer();
	
	public void setCustomer(Customer customer);
	
	public String getStreet();
	
	public void setStreet(String street);
	
	public String getStreetNumber();
	
	public void setStreetNumber(String streetNumber);
	
	public String getZipCode();
	
	public void setZipCode(String zipCode);
	
	public String getCity();
	
	public void setCity(String city);
	
	public String getCountry();
	
	public void setCountry(String country);
	
}
