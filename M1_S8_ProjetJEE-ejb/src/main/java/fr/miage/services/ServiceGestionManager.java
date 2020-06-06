/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.services;

import fr.miage.business.GestionCompetence;
import fr.miage.business.GestionEmploi;
import fr.miage.entities.Competence;
import fr.miage.entities.Equipe;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author astrid
 */
@Stateless
@LocalBean
public class ServiceGestionManager {

    GestionCompetence gestionCompetence;
    GestionEmploi gestionEmploi;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public ArrayList<Competence> listerCompetencesEquipe(Long idEquipe) {
        return gestionCompetence.listerCompetencesEquipe(idEquipe);
    }
    
    public void createCompetence(String nomCompetence) {
        // demander une compétence aux RH
        gestionCompetence.creerCompetence(nomCompetence);
    }
    
    public void creerDemande(Equipe equipe, ArrayList<Competence> competencesDemandees) {
        gestionEmploi.creerDemande(equipe, competencesDemandees);
    }
}
