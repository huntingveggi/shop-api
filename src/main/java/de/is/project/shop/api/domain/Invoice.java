package de.is.project.shop.api.domain;

import java.util.Collection;
import java.util.Date;

public interface Invoice extends Entity {
	public Collection<OrderItem> getOrderItems();
	
	public Date getInvoiceDate();
	
	public void setInvoiceDate(Date invoiceDate);
}
