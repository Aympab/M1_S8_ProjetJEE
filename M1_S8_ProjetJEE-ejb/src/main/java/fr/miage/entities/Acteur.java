/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

/**
 *
 * @author aympa
 */
@Entity
public class Acteur implements Serializable {

    //Attributs
    private String nomActeur;
    private String prenomActeur;

    public String getNomActeur() {
        return nomActeur;
    }

    public void setNomActeur(String nomActeur) {
        this.nomActeur = nomActeur;
    }

    public String getPrenomActeur() {
        return prenomActeur;
    }

    public void setPrenomActeur(String prenomActeur) {
        this.prenomActeur = prenomActeur;
    }

    public List<Competence> getListeCompetences() {
        return listeCompetences;
    }

    public void setListeCompetences(List<Competence> listeCompetences) {
        this.listeCompetences = listeCompetences;
    }

    public RoleActeur getRoleActeur() {
        return roleActeur;
    }

    public void setRoleActeur(RoleActeur roleActeur) {
        this.roleActeur = roleActeur;
    }

    public List<Candidature> getCandidaturePostulee() {
        return candidaturePostulee;
    }

    public void setCandidaturePostulee(List<Candidature> candidaturePostulee) {
        this.candidaturePostulee = candidaturePostulee;
    }

    public Equipe getEquipeActeur() {
        return equipeActeur;
    }

    public void setEquipeActeur(Equipe equipeActeur) {
        this.equipeActeur = equipeActeur;
    }
    
    @OneToMany
    private List<Competence> listeCompetences;
        
    public enum RoleActeur {
        Candidat,
        Collaborateur,
        RH,
        Manager
    }
    
    private RoleActeur roleActeur;
    
    //LIENS BD
    @OneToMany
    private List<Candidature> candidaturePostulee;
    
    @ManyToOne
    private Equipe equipeActeur;
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acteur)) {
            return false;
        }
        Acteur other = (Acteur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.miage.entities.Acteur[ id=" + id + " ]";
    }
    
}
