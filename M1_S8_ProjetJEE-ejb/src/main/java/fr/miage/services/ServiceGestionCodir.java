/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.services;

import fr.miage.business.GestionCandidature;
import fr.miage.business.GestionCompetence;
import fr.miage.business.GestionEmploi;
import fr.miage.entities.Acteur;
import fr.miage.entities.Candidature;
import fr.miage.entities.Competence;
import fr.miage.entities.Demande;
import fr.miage.entities.FicheDePoste;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author astrid
 */
@Stateless
@LocalBean
public class ServiceGestionCodir {
    
    GestionCompetence gestionCompetence = new GestionCompetence();
    GestionCandidature gestionCandidature = new GestionCandidature();

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public ArrayList<Competence> listerCompetencesManquantes() {
        return gestionCompetence.listerCompetencesManquantes();
    }
    
    public void validerCandidature(Long idCandidature){
        gestionCandidature.validerCandidature(idCandidature);
    }
    
    
    
}
