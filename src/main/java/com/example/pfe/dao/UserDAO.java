package com.example.pfe.dao;

import com.example.pfe.metier.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

public interface UserDAO extends JpaRepository<User, Integer> {
    public ArrayList<User>findById(int id);

    @Transactional
    public void removeById(int id);
}
