package de.is.project.shop.api.services;

import java.util.Collection;

import de.is.project.shop.api.domain.BillOfDelivery;
import de.is.project.shop.api.domain.Invoice;
import de.is.project.shop.api.domain.Order;
import de.is.project.shop.api.domain.OrderItem;
import de.is.project.shop.api.domain.Product;
import de.is.project.shop.api.domain.Request;
import de.is.project.shop.api.domain.ShoppingCart;

/**
 * @author Stefan Stahl
 *
 */
public interface OrderService {

	public void addProduct(Product product);

	public void removeProduct(Product product);
	
	public void refreshOrder();
	
	/* Implement as Singleton */
	public void setOrder(Order order);
	
	public Order getOrder();
	
	public Order placeOrder();
	
	public BillOfDelivery createBillOfDeliveryForItems(Collection<OrderItem> orderItems);
	
	public Invoice createInvoiceForItems(Collection<OrderItem> orderItems);
	
	public Order createOrderfromShoppingCart(ShoppingCart shoppingCart);
	
	public Order createOrderfromRequest(Request request);

}
