/**
 * 
 */
package com.yash.onlineshopping.service;

import java.util.Set;



import com.yash.onlineshopping.model.User;
import com.yash.onlineshopping.model.UserRole;

/**
 * @author namrata.jagtap
 *
 */

public interface UserService {

	//create user
	public User createUser(User user,Set<UserRole>userRoles) throws Exception;
		
	//get user
	public User getUser(String username);

	//delete by user
	public void deleteUser(Long userId);
	
}
