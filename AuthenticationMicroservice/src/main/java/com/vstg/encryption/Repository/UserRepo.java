package com.vstg.encryption.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstg.encryption.models.AppUser;

public interface UserRepo extends JpaRepository<AppUser, Long>{

	AppUser findByUsername(String username);
	
}
