package com.example.pfe.service;


import com.example.pfe.dao.DemandeDAO;
import com.example.pfe.metier.Demande;

import java.util.List;

public interface DemandeSevice {

    public List<Demande> getDemande() ;
    public void addDemande(Demande demande);
    public void removeDemande(int ref);
    public void updateDemande(int ref, Demande newData);
}
