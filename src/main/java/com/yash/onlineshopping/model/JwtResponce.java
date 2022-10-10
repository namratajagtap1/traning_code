/**
 * 
 */
package com.yash.onlineshopping.model;

/**
 * @author namrata.jagtap
 *
 */
public class JwtResponce {

	String token;

	public JwtResponce() {
	}

	public JwtResponce(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	

}
