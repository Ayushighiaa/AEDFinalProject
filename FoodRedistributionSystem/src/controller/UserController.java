/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.User;
import model.Role;
import service.UserService;

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Method to authenticate a user
    public User authenticate(String username, String password) {
        return userService.authenticateUser(username, password);
    }

    // Method to assign a role to a user
    public void assignRole(User user, Role role) {
        user.setRole(role.toString());
        userService.updateUser(user);
    }
}

