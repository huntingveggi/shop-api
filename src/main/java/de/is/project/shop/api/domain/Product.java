package de.is.project.shop.api.domain;

import java.io.InputStream;
import java.util.Collection;

public interface Product extends Entity {

	public String getName();

	public void setId(int id);
	
	public void setName(String name);

	public Collection<Category> getCategories();
	
	public Collection<Attribute> getAttributes();

	public Producer getProducer();

	public void setProducer(Producer producer);

	public String getDescription();

	public void setDescription(String description);

	public double getPrice();

	public void setPrice(double price);

	public int getStock();

	public void setStock(int stock);

	public InputStream getPicture();

	public void setPicture(InputStream picture);

	public double getRateOfTaxation();

	public void setRateOfTaxation(double rateOfTaxation);

	public String getMeasurand();

	public void setMeasurand(String measurand);

	public boolean isSpecialOffer();

	public void setSpecialOffer(boolean isSpecialOffer);

}
