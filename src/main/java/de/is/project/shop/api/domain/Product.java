package de.is.project.shop.api.domain;

import java.util.Collection;

public interface Product extends Entity {

	Producer getProducer();

	Collection<Category> getCategories();

	Collection<Attribute> getaAttributes();

}
