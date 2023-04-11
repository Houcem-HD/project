package com.example.pfe.metier;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Demande implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int ref;
    LocalDate date;
    String nom;

    public Demande(int ref, LocalDate date, String nom) {
        this.ref = ref;
        this.date = date;
        this.nom = nom;
    }

    public Demande() {
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Demande demande)) return false;
        return getRef() == demande.getRef();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRef());
    }

    @Override
    public String toString() {
        return "Demande{" +
                "ref=" + ref +
                ", date=" + date +
                ", nom='" + nom + '\'' +
                '}';
    }
}
