/**
 * 
 */
package com.yash.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.onlineshopping.model.User;

/**
 * @author namrata.jagtap
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByuserName(String userName);

}
