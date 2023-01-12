package cl.securityApp.services;

import java.util.Optional;

import cl.securityApp.models.User;

public interface UserService {
	
	public Optional<User> getUserById(Long id);

}
