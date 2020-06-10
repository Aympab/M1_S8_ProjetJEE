/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.business;

import fr.miage.entities.Competence;
import fr.miage.entities.Demande;
import fr.miage.entities.Equipe;
import fr.miage.entities.FicheDePoste;
import fr.miage.entities.FicheDePoste.StatutPoste;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.Local;

/**
 *Permet de gérer ce qui est fiche de poste et les demandes de compétences
 * @author aympa
 */
@Local
public interface GestionEmploiLocal {
    
    /**
     * Revient à servir une demande de poste
     * @param demandePoste
     * @param nomPoste
     * @param presentationEntreprise
     * @param presentationPoste 
     */
    public void creerFicheDePoste(Demande demandePoste, String nomPoste, String presentationEntreprise, String presentationPoste);
    public void modifierFicheDePoste(Long idFicheDePoste, Demande demandePoste, String nomPoste, StatutPoste statutPoste, String presentationEntreprise, String presentationPoste);
    public void supprimerFicheDePoste(Long idFicheDePoste);
    public ArrayList<FicheDePoste> listerPostes();
    
    
    public void creerDemande(Equipe equipe, ArrayList<Competence> competencesDemandees);
    public void modifierDemande(Long idDemande);
    
    
    public void validerDemande(Long idDemande);
    
    /**
     * Permet de lister les demandes qui n'ont pas été servies (c'est à dire les postes vides)
     * @return 
     */
    public Collection<Demande> listerDemandesACombler();
    
    public FicheDePoste getFicheDePosteById(Long idFicheDePoste);
    
}
