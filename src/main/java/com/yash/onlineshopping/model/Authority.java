/**
 * 
 */
package com.yash.onlineshopping.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author namrata.jagtap
 *
 */
public class Authority implements GrantedAuthority {

	private String authority;

	public Authority(String authority) {
		this.authority = authority;
	}

	@Override
	public String getAuthority() {
		return this.authority;
	}

}
