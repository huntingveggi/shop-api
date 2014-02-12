package de.is.project.shop.api.domain;

//Element interface
public interface Visitable {
	
	public void accept(Visitor visitor);
	
}
