package de.is.project.shop.api.domain;

import java.util.Collection;

public interface Category {

	public String getName();

	public void setName(String name);

	public Category getSuperiorCategory();

	public void setSuperiorCategory(Category category);

	public Collection<Category> getSubCategories();

}
