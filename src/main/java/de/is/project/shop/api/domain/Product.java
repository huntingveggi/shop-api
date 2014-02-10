package de.is.project.shop.api.domain;

import java.util.Collection;

public interface Product {
	
	public String getName();

	public void setName(String name);

	public Collection<Category> getCategories();
	
	public Collection<Attribute> getaAttributes();

	public Producer getProducer();

	public void setProducer(Producer producer);

	public String getDescription();

	public void setDescription(String description);

	public double getPrice();

	public void setPrice(double price);

	public int getStock();

	public void setStock(int stock);

	public byte[] getPicture();

	public void setPicture(byte[] picture);

	public double getRateOfTaxation();

	public void setRateOfTaxation(double rateOfTaxation);

	public String getMeasurand();

	public void setMeasurand(String measurand);

	public boolean isSecialOffer();

	public void setIsSpecialOffer(boolean isSpecialOffer);

}
