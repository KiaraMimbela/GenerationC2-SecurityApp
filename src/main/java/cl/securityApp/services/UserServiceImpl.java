package cl.securityApp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.securityApp.models.User;
import cl.securityApp.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> getUserById(Long id) {
        Boolean exists = userRepository.existsById(id);

        if (exists) {
            Optional<User> user = userRepository.findById(id);
            return user;
        }
        return null;
    }
}

