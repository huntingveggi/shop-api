package de.is.project.shop.api.domain;

public interface Customer extends Entity{
	
	public String getTitle();

	public void setTitle(String title);

	public String getFirstName();

	public void setFirstName(String firstName);

	public String getLastName();

	public void setLastName(String lastName);

	public String getSex();

	public void setSex(String sex);

	public boolean isBillingCustomer();
	
	public Address getAddress();
	
	public void setAddress(Address address);

	public void setBillingCustomer(boolean billingCustomer);

}
