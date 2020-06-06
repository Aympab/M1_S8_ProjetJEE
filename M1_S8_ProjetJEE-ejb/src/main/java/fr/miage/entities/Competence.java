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
import javax.persistence.*;

/**
 *
 * @author aympa
 */
@Entity
public class Competence implements Serializable {

    //Attributs
    private String nomCompetence;

    //LIENS BD
    @ManyToOne
    private Acteur acteurCompetent;
    
    @ManyToMany(mappedBy="competencesDemandees") //Ca ca fait le commentaire en dessous
    private List<Demande> demandeNecessitantLaCompetence; 
//Définir qui est la table maitre (celle qui a la priorité sur l'association, ici plutot la demande) elle porte m'attribut birectionnel
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
        if (!(object instanceof Competence)) {
            return false;
        }
        Competence other = (Competence) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.miage.entities.Competence[ id=" + id + " ]";
    }

    public String getNomCompetence() {
        return nomCompetence;
    }

    public void setNomCompetence(String nomCompetence) {
        this.nomCompetence = nomCompetence;
    }

    public Acteur getActeurCompetent() {
        return acteurCompetent;
    }

    public void setActeurCompetent(Acteur acteurCompetent) {
        this.acteurCompetent = acteurCompetent;
    }

    public List<Demande> getDemandeNecessitantLaCompetence() {
        return demandeNecessitantLaCompetence;
    }

    public void setDemandeNecessitantLaCompetence(List<Demande> demandeNecessitantLaCompetence) {
        this.demandeNecessitantLaCompetence = demandeNecessitantLaCompetence;
    }
    
}
