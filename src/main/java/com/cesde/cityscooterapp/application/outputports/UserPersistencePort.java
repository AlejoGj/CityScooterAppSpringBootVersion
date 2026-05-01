package com.cesde.cityscooterapp.application.outputports;

import com.cesde.cityscooterapp.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserPersistencePort {

    User saveUser(User user);
    User updateUser (User user);

    Optional <User> findUserById (int id);
    List <User> findAllUsers();

    void deleteUserById(int id);

}
