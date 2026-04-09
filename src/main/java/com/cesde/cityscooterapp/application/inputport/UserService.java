package com.cesde.cityscooterapp.application.inputport;

import com.cesde.cityscooterapp.domain.User;

import java.util.Optional;

public interface UserService {

    User createUser(User user);
    User updateUser(User user);
    Optional <User> getUserById(int id);

}
