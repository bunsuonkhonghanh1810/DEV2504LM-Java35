package vn.devmaster.lab02.pkg_annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.devmaster.lab02.pkg_annotation.service.UserService;

@RestController
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String getUser() {
        return userService.getUserDetails();
    }

    @GetMapping("/usesr")
    public String getUsers() {
        return "<h1>Get all users</h1>";
    }

    @PostMapping("/users")
    public String createUser() {
        return "<h1>User created</h1>";
    }
}
