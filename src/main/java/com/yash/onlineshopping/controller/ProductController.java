/**
 * 
 */
package com.yash.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.onlineshopping.model.productcat.Category;
import com.yash.onlineshopping.model.productcat.Product;
import com.yash.onlineshopping.service.ProductService;

/**
 * @author namrata.jagtap
 *
 */
@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		Product product1 = this.productService.addProduct(product);
		return ResponseEntity.ok(product1);

	}

	// get category

	@GetMapping("/{pId}")
	public Product getProduct(@PathVariable("pId") Long pId) {
		return this.productService.getProduct(pId);

	}

	// get All category

	@GetMapping("/")
	public ResponseEntity<?> getProducts() {
		return ResponseEntity.ok(this.productService.getProducts());
	}

	// update

	@PutMapping("/")
	public Product updateProduct(@RequestBody Product product) {
		return this.productService.updateProduct(product);
	}

	// delete

	@DeleteMapping("/{pId}")
	public void deleteProduct(@PathVariable("pId") Long pId) {
		this.productService.deleteProduct(pId);
	}

}
