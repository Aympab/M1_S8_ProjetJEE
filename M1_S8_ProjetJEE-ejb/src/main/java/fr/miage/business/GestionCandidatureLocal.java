/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.business;

import fr.miage.entities.Acteur;
import fr.miage.entities.Candidature;
import fr.miage.entities.Candidature.StatutCandidature;
import fr.miage.entities.FicheDePoste;
import java.util.ArrayList;
import javax.ejb.Local;

/**
 *Permet de gérer les candidatures 
 * @author aympa
 */
@Local
public interface GestionCandidatureLocal {
    
    public void creerCandidature(StatutCandidature statut, Acteur candidat, FicheDePoste poste);
    public void modifierCandidature(Long idCandidature, StatutCandidature statut, ArrayList<Acteur> candidats, FicheDePoste poste);
    public void supprimerCandidature(Long idCandidature);
    
    public ArrayList<Candidature> listerCandidatures();
    
    /**
     * Change le statut de la candidature à Validée
     * @param idCandidature 
     */
    public void validerCandidature(Long idCandidature);
    
    
}
