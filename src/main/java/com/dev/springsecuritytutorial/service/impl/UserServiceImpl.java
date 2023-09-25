package com.dev.springsecuritytutorial.service.impl;

import com.dev.springsecuritytutorial.entity.User;
import com.dev.springsecuritytutorial.model.UserModel;
import com.dev.springsecuritytutorial.repository.UserRepository;
import com.dev.springsecuritytutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User registerUser(UserModel userModel) {
        User user = new User();
        user.setEmail(userModel.getEmail());
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setRole("ROLE_USER");
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));

       return this.userRepository.save(user);

    }
}
