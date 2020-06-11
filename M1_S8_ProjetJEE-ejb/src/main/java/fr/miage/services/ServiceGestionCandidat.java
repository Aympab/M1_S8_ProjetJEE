/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.services;

import fr.miage.business.GestionCandidatureLocal;
import fr.miage.business.GestionEmploiLocal;
import fr.miage.entities.Acteur;
import fr.miage.entities.Candidature;
import fr.miage.entities.Demande;
import fr.miage.entities.FicheDePoste;
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
public class ServiceGestionCandidat implements ServiceGestionCandidatLocal {

    @EJB
    private GestionEmploiLocal gestionEmploi;

    @EJB
    private GestionCandidatureLocal gestionCandidature;

    @Override
    public Collection<Demande> listerDemandesACombler() {
        return gestionEmploi.listerDemandesACombler();
    }

    @Override
    public void creerCandidature(Candidature.StatutCandidature statut, Acteur candidat, FicheDePoste poste) {
        gestionCandidature.creerCandidature(statut, candidat, poste);
    }

    @Override
    public Acteur getCandidatById(Long idCandidature) {
        return gestionCandidature.getCandidatById(idCandidature);
    }

    @Override
    public FicheDePoste getFicheDePosteById(Long idFicheDePoste) {
        return gestionEmploi.getFicheDePosteById(idFicheDePoste);
    }
}
