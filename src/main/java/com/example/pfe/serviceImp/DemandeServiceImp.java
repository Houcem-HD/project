package com.example.pfe.serviceImp;

import com.example.pfe.dao.DemandeDAO;
import com.example.pfe.metier.Demande;
import com.example.pfe.service.DemandeSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DemandeServiceImp implements DemandeSevice {

    @Autowired
    DemandeDAO demandeDAO;
    public List<Demande> getDemande(){
        return demandeDAO.findAll();
    }

    @Override
    public void addDemande(Demande demande) {
        demandeDAO.save(demande);
    }

    @Override
    public void removeDemande(int ref) {
        demandeDAO.deleteById(ref);
    }

    @Override
    public void updateDemande(int ref, Demande newData) {
        demandeDAO.deleteById(ref);
        demandeDAO.save(newData);
    }

}
