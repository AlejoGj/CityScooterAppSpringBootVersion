package com.cesde.cityscooterapp.infrastructure.in.controllers;


import com.cesde.cityscooterapp.domain.User;
import com.cesde.cityscooterapp.application.inputport.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    User getUserById(@PathVariable int id) {
        return userService.getUserById(id).orElse(null);
    }

}
