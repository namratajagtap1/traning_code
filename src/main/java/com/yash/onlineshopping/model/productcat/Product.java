/**
 * 
 */
package com.yash.onlineshopping.model.productcat;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

/**
 * @author namrata.jagtap
 *
 */
@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pId;
	private String pName;
	private float price;
	private float discount;
	private int numOfproduct;
	private boolean available=false;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;
	
	public Product() {
		
	}
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public int getNumOfproduct() {
		return numOfproduct;
	}
	public void setNumOfproduct(int numOfproduct) {
		this.numOfproduct = numOfproduct;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
}
