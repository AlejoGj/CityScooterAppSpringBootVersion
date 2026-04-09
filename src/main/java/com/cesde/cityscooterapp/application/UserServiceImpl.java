package com.cesde.cityscooterapp.application;


import com.cesde.cityscooterapp.application.inputport.UserService;
import com.cesde.cityscooterapp.domain.User;
import com.cesde.cityscooterapp.infrastructure.out.adapter.UserRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepositoryImpl userRepositoryImpl;

    UserServiceImpl(UserRepositoryImpl userRepositoryImpl) {
        this.userRepositoryImpl = userRepositoryImpl;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public Optional<User> getUserById(int id) {
        return Optional.empty();
    }
}
