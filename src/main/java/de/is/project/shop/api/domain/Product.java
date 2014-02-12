package de.is.project.shop.api.domain;

import java.util.Collection;

public interface Product extends Entity {
<<<<<<< HEAD
=======

	public String getName();
>>>>>>> dbc4627839905e209a638e7d9be4175d50d2fafa

	public void setId(int id);
	
	public String getName();
	
	public void setName(String name);

	public Collection<Category> getCategories();
<<<<<<< HEAD
	
	public Collection<Attribute> getAttributes();
=======

	public Collection<Attribute> getaAttributes();
>>>>>>> dbc4627839905e209a638e7d9be4175d50d2fafa

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

	public boolean isSpecialOffer();

	public void setSpecialOffer(boolean isSpecialOffer);

}
