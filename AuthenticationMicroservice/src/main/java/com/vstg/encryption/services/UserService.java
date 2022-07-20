package com.vstg.encryption.services;

import com.vstg.encryption.models.AppUser;

public interface UserService {

	AppUser saveUser(AppUser user);
	AppUser getUser(String username);
	
}
