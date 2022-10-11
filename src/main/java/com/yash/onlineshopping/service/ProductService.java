/**
 * 
 */
package com.yash.onlineshopping.service;

import java.util.Set;


import com.yash.onlineshopping.model.productcat.Product;

/**
 * @author namrata.jagtap
 *
 */
public interface ProductService {

public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public Product getProduct(Long pId);
	
	public void deleteProduct(Long pId);
	
	public Set<Product>getProducts();
}
