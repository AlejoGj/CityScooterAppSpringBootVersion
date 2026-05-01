package com.cesde.cityscooterapp.application;


import com.cesde.cityscooterapp.application.inputport.UserService;
import com.cesde.cityscooterapp.application.outputports.UserPersistencePort;
import com.cesde.cityscooterapp.domain.User;
import com.cesde.cityscooterapp.infrastructure.out.adapter.UserRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserPersistencePort userPersistencePort;

    public UserServiceImpl(UserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public User createUser(User user)
    {
        return userPersistencePort.saveUser(user);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public Optional<User> getUserById(int id) {

        User user = userPersistencePort.findUserById(id).stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);


        return Optional.ofNullable(user);
    }
}
