package de.is.project.shop.api.domain;

public interface Visitor {

	public void visit(ShoppingCart shoppingCart);

	public void visit(Order order);
}
