package com.yash.onlineshopping;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yash.onlineshopping.model.Role;
import com.yash.onlineshopping.model.User;
import com.yash.onlineshopping.model.UserRole;
import com.yash.onlineshopping.service.UserService;

@SpringBootApplication
public class OnlineshoppingApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		
		
		SpringApplication.run(OnlineshoppingApplication.class, args);
		System.out.println("application running successfully..........");
		
	

	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("application run");
		
		/*
		 * User userdata=new User(); userdata.setUserName("sharvil12");
		 * userdata.setFirstName("Sharvil"); userdata.setLastName("Shitole");
		 * userdata.setPassword("12345"); userdata.setMobNo("9863267564");
		 * userdata.setEmail("sss@gmail.com"); userdata.setProfile("pn.png");
		 * 
		 * 
		 * Role role=new Role(); role.setRoleId(11L);
		 * role.setRoleName("customerExecutive");
		 * 
		 * Set<UserRole>userRoleSet=new HashSet<>(); UserRole addrole=new UserRole();
		 * addrole.setRole(role); addrole.setUser(userdata);
		 * 
		 * userRoleSet.add(addrole);
		 * 
		 * 
		 * User userdata1=this.userService.createUser(userdata, userRoleSet);
		 * System.out.println(userdata1.getUserName());
		 * 
		 */
		 
	}

}
