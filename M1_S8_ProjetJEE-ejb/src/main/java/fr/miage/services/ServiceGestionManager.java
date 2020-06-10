/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.services;

import fr.miage.business.GestionCompetenceLocal;
import fr.miage.business.GestionEmploiLocal;
import fr.miage.entities.Competence;
import fr.miage.entities.Equipe;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author astrid
 */
@Stateless
@LocalBean
public class ServiceGestionManager {

    
    @EJB
    GestionCompetenceLocal gestionCompetence;// = new GestionCompetence();
    
    @EJB
    GestionEmploiLocal gestionEmploi;// = new GestionEmploi();
 

    public Collection<Competence> listerCompetencesEquipe(Long idEquipe) {
        return gestionCompetence.listerCompetencesEquipe(idEquipe);
    }

    public void createCompetence(String nomCompetence) {
//        System.out.println("AEMLAZJE LMIKUAZGE KMUAZGE IOUMAfr.miage.services.ServiceGestionManager.createCompetence()");
//        System.out.println(nomCompetence);
        //IL PASSE JUSQUE LA

// demander une compétence aux RH
        gestionCompetence.creerCompetence(nomCompetence);
    }

    public void creerDemande(Equipe equipe, ArrayList<Competence> competencesDemandees) {
        gestionEmploi.creerDemande(equipe, competencesDemandees);
    }
}
