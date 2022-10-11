/**
 * 
 */
package com.yash.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.onlineshopping.model.productcat.Category;

/**
 * @author namrata.jagtap
 *
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
