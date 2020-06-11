/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.services;

import fr.miage.entities.Acteur;
import fr.miage.entities.Candidature;
import fr.miage.entities.Demande;
import fr.miage.entities.FicheDePoste;
import java.util.Collection;

/**
 *
 * @author aympa
 */
public interface ServiceGestionCandidatLocal {

    public Collection<Demande> listerDemandesACombler();

    public void creerCandidature(Candidature.StatutCandidature statut, Acteur candidat, FicheDePoste poste);

    public Acteur getCandidatById(Long idCandidature);

    public FicheDePoste getFicheDePosteById(Long idFicheDePoste);
}
