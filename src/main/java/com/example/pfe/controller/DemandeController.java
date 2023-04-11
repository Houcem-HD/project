package com.example.pfe.controller;
import com.example.pfe.metier.Demande;
import com.example.pfe.service.DemandeSevice;
import com.example.pfe.serviceImp.DemandeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/demande")
@RestController
public class DemandeController {
    @Autowired
    DemandeSevice demandeService;

    @GetMapping("/getAll")
    public List<Demande> getAll(){
        return demandeService.getDemande();
    }

    @PostMapping("/add")
    public void addDemande(@RequestBody Demande demande){
        demandeService.addDemande(demande);
    }

    @PutMapping("/update/{id}")
    public void updateDemande(@PathVariable int id,@RequestBody Demande demande){
        this.demandeService.updateDemande(id, demande);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDemande(@PathVariable int id){
        this.demandeService.removeDemande(id);
    }
}
