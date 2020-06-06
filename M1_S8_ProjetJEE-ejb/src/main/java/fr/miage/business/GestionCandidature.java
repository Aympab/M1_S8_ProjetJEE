/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.business;

import fr.miage.entities.Acteur;
import fr.miage.entities.Candidature;
import fr.miage.entities.Competence;
import fr.miage.entities.FicheDePoste;
import fr.miage.repositories.ActeurFacade;
import fr.miage.repositories.ActeurFacadeLocal;
import fr.miage.repositories.CandidatureFacade;
import fr.miage.repositories.CandidatureFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author aympa
 */
@Stateless
public class GestionCandidature implements GestionCandidatureLocal {

    @EJB
    private CandidatureFacadeLocal facadeCandidature = new CandidatureFacade();
    
    @EJB
    private ActeurFacadeLocal facadeActeur = new ActeurFacade();
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void creerCandidature(Candidature.StatutCandidature statut, Acteur candidat, FicheDePoste poste) {
        Candidature candidature = new Candidature();
        candidature.setCandidat(candidat);
        candidature.setPoste(poste);
        
        facadeCandidature.create(candidature);
    }

    @Override
    public void modifierCandidature(Long idCandidature, Candidature.StatutCandidature statut, ArrayList<Acteur> candidats, FicheDePoste poste) {
    }

    @Override
    public void supprimerCandidature(Long idCandidature) {
    }

    @Override
    public ArrayList<Candidature> listerCandidatures() {
        return null;
    }

    @Override
    public void validerCandidature(Long idCandidature) {
        
        Candidature candidature = facadeCandidature.find(idCandidature);
        candidature.setStatutCandidature(Candidature.StatutCandidature.Validee);
        
        Acteur candidat = candidature.getCandidat();
        candidat.setRoleActeur(Acteur.RoleActeur.Collaborateur);
        
        FicheDePoste poste = candidature.getPoste();
        poste.setStatutPoste(FicheDePoste.StatutPoste.Archivee);
        
    }
    
    @Override
    public void creerCandidat(String nom, String prenom, List<Competence> listComp){
        Acteur candidat = new Acteur();
        candidat.setNomActeur(nom);
        candidat.setPrenomActeur(prenom);
        candidat.setRoleActeur(Acteur.RoleActeur.Candidat);
        candidat.setListeCompetences(listComp);
        
        facadeActeur.create(candidat);
    }
    
    public Acteur getCandidatById(Long idCandidat) {
        return facadeActeur.find(idCandidat);
    }

}
