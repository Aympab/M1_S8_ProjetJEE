/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.services;

import fr.miage.entities.Competence;
import fr.miage.entities.Equipe;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author aympa
 */
public interface ServiceGestionManagerLocal {
    public Collection<Competence> listerCompetencesEquipe(Long idEquipe);
    
    public void createCompetence(String nomCompetence);
    
    public void creerDemande(Equipe equipe, ArrayList<Competence> competencesDemandees);
}
