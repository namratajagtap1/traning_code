/**
 * 
 */
package com.yash.onlineshopping.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yash.onlineshopping.model.User;
import com.yash.onlineshopping.repository.UserRepository;

/**
 * @author namrata.jagtap
 *
 */

@Service
public class UserDetailServiceSecurityImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=this.userRepository.findByuserName(username);
		if(user==null) {
			System.out.println("user not present");
			throw new UsernameNotFoundException("this User not found.????");
		}
		return user;
	}

}
