/**
 * 
 */
package com.yash.onlineshopping.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.onlineshopping.model.Role;
import com.yash.onlineshopping.model.User;
import com.yash.onlineshopping.model.UserRole;
import com.yash.onlineshopping.service.UserService;
import com.yash.onlineshopping.serviceImpl.UserFoundException;

/**
 * @author namrata.jagtap
 *
 */

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userService;
	
	

	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
		
		
		Set<UserRole> roles = new HashSet<>();
		Role role = new Role();
		role.setRoleId(22L);
		role.setRoleName("customer");

		/*
		 * Set<UserRole>roles1=new HashSet<>(); Role role1=new Role();
		 * role1.setRoleId(32L); role1.setRoleName("customer_executive");
		 * urole.setRole(role1); roles1.add(urole);
		 */

		UserRole urole = new UserRole();
		urole.setUser(user);
		urole.setRole(role);

		roles.add(urole);

		return this.userService.createUser(user, roles);

	}

	//get user by username
	@GetMapping("/{userName}")

	public User getUser(@PathVariable("userName") String username ) {
		return userService.getUser(username);
	}

	/*
	 * @GetMapping("/name") public String getdata() {
	 * 
	 * return "hello"; }
	 */
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long userId) {
		 userService.deleteUser(userId);
	}
	
	
}
