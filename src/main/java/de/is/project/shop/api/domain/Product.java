package de.is.project.shop.api.domain;

import java.util.Collection;

public interface Product {

	Producer getProducer();

	Collection<Category> getCategories();

	Collection<Attribute> getaAttributes();

}
