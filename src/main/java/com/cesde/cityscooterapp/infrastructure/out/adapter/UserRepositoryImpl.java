package com.cesde.cityscooterapp.infrastructure.out.adapter;


import com.cesde.cityscooterapp.application.outputports.UserPersistencePort;
import com.cesde.cityscooterapp.domain.User;
import com.cesde.cityscooterapp.infrastructure.out.mapper.UserMapper;
import com.cesde.cityscooterapp.infrastructure.out.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserPersistencePort {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserRepositoryImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public Optional<User> findUserById(int id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAllUsers() {
        return List.of();
    }

    @Override
    public void deleteUserById(int id) {

    }
}
