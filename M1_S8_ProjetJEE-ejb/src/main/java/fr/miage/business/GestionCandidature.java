/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.business;

import fr.miage.entities.Acteur;
import fr.miage.entities.Candidature;
import fr.miage.entities.FicheDePoste;
import fr.miage.repositories.ActeurFacadeLocal;
import fr.miage.repositories.CandidatureFacadeLocal;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author aympa
 */
@Stateless
public class GestionCandidature implements GestionCandidatureLocal {

    @EJB
    private CandidatureFacadeLocal facadeCandidature;
    
    @EJB
    private ActeurFacadeLocal facadeActeur;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void creerCandidature(Candidature.StatutCandidature statut, Acteur candidat, FicheDePoste poste) {
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
    }
}
