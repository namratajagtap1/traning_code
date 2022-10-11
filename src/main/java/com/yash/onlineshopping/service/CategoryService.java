/**
 * 
 */
package com.yash.onlineshopping.service;

import java.util.Set;

import com.yash.onlineshopping.model.productcat.Category;

/**
 * @author namrata.jagtap
 *
 */
public interface CategoryService {

	public Category addCategory(Category category);
	
	public Category updateCategory(Category category);
	
	public Category getCategory(Long catId);
	
	public void deleteCategory(Long catId);
	
	public Set<Category>getCategories();
	
	
}
