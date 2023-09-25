package com.dev.springsecuritytutorial.service;

import com.dev.springsecuritytutorial.entity.User;
import com.dev.springsecuritytutorial.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
