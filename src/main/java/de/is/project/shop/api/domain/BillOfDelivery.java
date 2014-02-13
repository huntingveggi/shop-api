package de.is.project.shop.api.domain;

import java.util.Collection;
import java.util.Date;

public interface BillOfDelivery {

	public Collection<OrderItem> getOrderItems();
	
	public Date getDeliveryDate();
	
	public void setDeliveryDate(Date deliveryDate);
}
