/**
 * 
 */
package com.yash.onlineshopping.model.productcat;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author namrata.jagtap
 *
 */
@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long catId;
	private String name;
	
	@OneToMany(mappedBy = "category",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JsonIgnore
	Set<Product>products=new LinkedHashSet<>();
	
	
	public Category() {
		
	}

	public Category(String name) {
		super();
		this.name = name;
	}

	public Long getCatId() {
		return catId;
	}
	public void setCatId(Long catId) {
		this.catId = catId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	

}
