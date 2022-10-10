/**
 * 
 */
package com.yash.onlineshopping.serviceImpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.onlineshopping.model.User;
import com.yash.onlineshopping.model.UserRole;
import com.yash.onlineshopping.repository.RoleRepository;
import com.yash.onlineshopping.repository.UserRepository;
import com.yash.onlineshopping.service.UserService;

/**
 * @author namrata.jagtap
 *
 */
@Service
public class userServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User presentUser = this.userRepository.findByuserName(user.getUserName());

		if (presentUser != null) {
			System.out.println("User is already present");
			throw new Exception("User Already present");
		} else {

			for (UserRole urole : userRoles) {
				roleRepository.save(urole.getRole());
			}

			user.getUserRole().addAll(userRoles);
			presentUser = this.userRepository.save(user);
		}
		return presentUser;
	}

	// getuser by username
	@Override
	public User getUser(String username) {
		return userRepository.findByuserName(username);
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);;
	}

}
