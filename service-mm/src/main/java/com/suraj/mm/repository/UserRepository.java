/**
 * 
 */
package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.User;

/**
 * @author Roshan Singh
 * @version 1.0 Repository for managing all user related DB Query
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);

}
