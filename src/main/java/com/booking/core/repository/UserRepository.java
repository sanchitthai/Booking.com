package com.booking.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.core.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
