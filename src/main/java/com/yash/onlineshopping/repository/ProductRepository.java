/**
 * 
 */
package com.yash.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.onlineshopping.model.productcat.Product;

/**
 * @author namrata.jagtap
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long>{

}
