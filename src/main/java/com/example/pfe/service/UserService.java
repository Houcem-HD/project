package com.example.pfe.service;

import com.example.pfe.metier.User;

import java.util.List;

public interface UserService {


    public List<User> getUsers() ;
    public void addUser(User user);
    public void removeUser(int id);
    public void updateUser(int id, User user);
}
