package com.example.pfe.dao;

import com.example.pfe.metier.Demande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandeDAO extends JpaRepository<Demande, Integer> {
}
