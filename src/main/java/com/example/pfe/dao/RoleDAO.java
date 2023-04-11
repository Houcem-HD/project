package com.example.pfe.dao;

import com.example.pfe.metier.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

public interface RoleDAO extends JpaRepository<Role, Integer> {

}
