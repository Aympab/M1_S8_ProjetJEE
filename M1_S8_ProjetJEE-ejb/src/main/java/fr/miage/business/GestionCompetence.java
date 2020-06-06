/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.business;

import fr.miage.entities.Acteur;
import fr.miage.entities.Competence;
import fr.miage.entities.Equipe;
import fr.miage.repositories.ActeurFacadeLocal;
import fr.miage.repositories.CompetenceFacadeLocal;
import fr.miage.repositories.EquipeFacadeLocal;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author aympa
 */
@Stateless
public class GestionCompetence implements GestionCompetenceLocal {

    @EJB
    private EquipeFacadeLocal facadeEquipe;
    
    @EJB
    private CompetenceFacadeLocal facadeCompetence;
    
    @EJB
    private ActeurFacadeLocal facadeActeur;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void creerCompetence(String nomCompetence) {
        Competence comp = new Competence();
        comp.setNomCompetence(nomCompetence);
        
        facadeCompetence.create(comp);
    }

    @Override
    public void supprimerCompetence(Long idCompetence) {
    }

    @Override
    public void modifierCompetence(Long idCompetence, String nouveauNomCompetence) {
    }

    @Override
    public ArrayList<Competence> listerCompetences() {
        return null;
    }

    @Override
    public ArrayList<Competence> listerCompetencesEquipe(Long idEquipe) {
        return null;
    }

    @Override
    public ArrayList<Competence> listerCompetencesActeur(Long idActeur) {
        return null;
    }

    @Override
    public ArrayList<Competence> listerCompetencesManquantes() {
        return null;
    }

    @Override
    public void creerEquipe(String nomEquipe) {
        Equipe equipe = new Equipe();
        equipe.setNomEquipe(nomEquipe);
        
        facadeEquipe.create(equipe);
    }

    @Override
    public void supprimerEquipe(Long idEquipe) {
    }
}
