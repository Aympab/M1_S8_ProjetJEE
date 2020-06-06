/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.services;

import fr.miage.business.GestionCandidature;
import fr.miage.business.GestionEmploi;
import fr.miage.entities.Acteur;
import fr.miage.entities.Candidature;
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
public class ServiceGestionCandidat {

    private GestionEmploi gestionEmploi = new GestionEmploi();
    private GestionCandidature gestionCandidature = new GestionCandidature() ;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public ArrayList<Demande> listerDemandesACombler() {
        return gestionEmploi.listerDemandesACombler();
    }
    
    public void creerCandidature(Candidature.StatutCandidature statut, Acteur candidat, FicheDePoste poste) {
        gestionCandidature.creerCandidature(statut, candidat, poste);
    }
    
    public Acteur getCandidatById(Long idCandidature) {
        return gestionCandidature.getCandidatById(idCandidature);
    }
    
    public FicheDePoste getFicheDePosteById(Long idFicheDePoste) {
        return gestionEmploi.getFicheDePosteById(idFicheDePoste);
    }
}
