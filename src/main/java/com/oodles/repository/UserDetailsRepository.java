package com.oodles.repository;

/**
 * hi pawan
 */

import org.springframework.data.jpa.repository.JpaRepository;
import com.oodles.model.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

	//UserDetails getUserName(String userName);

}
