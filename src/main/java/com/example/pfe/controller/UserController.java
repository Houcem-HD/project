package com.example.pfe.controller;

import com.example.pfe.metier.User;
import com.example.pfe.service.UserService;
import com.example.pfe.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getUsers();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PutMapping("/update/{id}")
    public void updateUser(@PathVariable int id,@RequestBody User user){
        this.userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id){
        this.userService.removeUser(id);
    }
}
