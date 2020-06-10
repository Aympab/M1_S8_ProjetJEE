/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.business;

import fr.miage.entities.Acteur;
import fr.miage.entities.Competence;
import fr.miage.entities.Equipe;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.Local;

/**
 * Permet de gérer les compétences (et les compétences au sein d'une équipe)
 * @author aympa
 */
@Local
public interface GestionCompetenceLocal {
    
    public void creerCompetence(String nomCompetence);
    public void supprimerCompetence(Long idCompetence);
    public void modifierCompetence(Long idCompetence, String nouveauNomCompetence);
    
    /**
     * Permet de lister la totalité des compétences de l'entreprise
     * @return 
     */
    public Collection<Competence> listerCompetences();
    
    /**
     * Liste les compétences d'une certaine équipe
     * @param idEquipe L'ID de l'équipe pour laquelle on veut lister les compétences
     * @return 
     */
    public Collection<Competence> listerCompetencesEquipe(Long idEquipe); 

    /**
     * Liste les compétences d'un acteur en particulier
     * @param idActeur L'acteur pour lequel on veut lister les compétences
     * @return 
     */
    public Collection<Competence> listerCompetencesActeur(Long idActeur); 
    
    /**
     * Renvoie la liste des compétences manquantes dans l'entreprise
     * @return 
     */
    public Collection<Competence> listerCompetencesManquantes();
    
    public void creerEquipe(String nomEquipe);
    public void supprimerEquipe(Long idEquipe);
    // TODO : modifierEquipe
    
    
}
