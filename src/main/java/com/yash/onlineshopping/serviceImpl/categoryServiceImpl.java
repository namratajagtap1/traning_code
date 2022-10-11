/**
 * 
 */
package com.yash.onlineshopping.serviceImpl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.onlineshopping.model.productcat.Category;
import com.yash.onlineshopping.repository.CategoryRepository;
import com.yash.onlineshopping.service.CategoryService;

/**
 * @author namrata.jagtap
 *
 */
@Service
public class categoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category addCategory(Category category) {

		return this.categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Category category) {

		return this.categoryRepository.save(category);
	}

	@Override
	public Category getCategory(Long catId) {

		return this.categoryRepository.findById(catId).get();
	}

	@Override
	public void deleteCategory(Long catId) {

		Category category=new Category();
		category.setCatId(catId);
		this.categoryRepository.delete(category);;
	}

	@Override
	public Set<Category> getCategories() {
		return new LinkedHashSet<>(this.categoryRepository.findAll());
	}

}
