package com.example.pfe.serviceImp;

import com.example.pfe.dao.UserDAO;
import com.example.pfe.metier.User;
import com.example.pfe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserDAO userDAO;

    public List<User> getUsers(){
        return userDAO.findAll();
    }
    public void addUser(User user){
        userDAO.save(user);
    }

    public void removeUser(int id){
           userDAO.deleteById(id);
    }

    public void updateUser(int id,User newData){
        userDAO.removeById(id);
        userDAO.save(newData);
    }

}
