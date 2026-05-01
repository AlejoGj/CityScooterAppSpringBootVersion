package com.cesde.cityscooterapp.application.inputport;

import com.cesde.cityscooterapp.domain.User;

import java.util.List;

public interface UserAdminService {

    List<User> getAllUsers();
    void deleteUserById (int id);

}
