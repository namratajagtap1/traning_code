/**
 * 
 */
package com.yash.onlineshopping.serviceImpl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.onlineshopping.model.productcat.Product;
import com.yash.onlineshopping.repository.ProductRepository;
import com.yash.onlineshopping.service.ProductService;

/**
 * @author namrata.jagtap
 *
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		return this.productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {

		return this.productRepository.save(product);
	}

	@Override
	public Product getProduct(Long pId) {

		return this.productRepository.findById(pId).get();
	}

	@Override
	public void deleteProduct(Long pId) {
		Product product=new Product();
		product.setpId(pId);
    this.productRepository.delete(product);		
	}

	@Override
	public Set<Product> getProducts() {
		return new LinkedHashSet<>(this.productRepository.findAll());
	}

}
