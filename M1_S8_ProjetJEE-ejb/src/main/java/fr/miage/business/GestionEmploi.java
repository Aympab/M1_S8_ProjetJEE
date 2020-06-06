/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.business;

import fr.miage.entities.Demande;
import fr.miage.entities.FicheDePoste;
import fr.miage.repositories.*;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author aympa
 */
@Stateless
public class GestionEmploi implements GestionEmploiLocal {

    @EJB
    private ActeurFacadeLocal facadeActeur;
    
    @EJB
    private DemandeFacadeLocal facadeDemande;
    
    @EJB
    private FicheDePosteFacadeLocal facadeFicheDePoste;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void creerFicheDePoste(Demande demandePoste, String nomPoste, FicheDePoste.StatutPoste statutPoste, String presentationEntreprise, String presentationPoste) {

    }

    @Override
    public void modifierFicheDePoste(Long idFicheDePoste, Demande demandePoste, String nomPoste, FicheDePoste.StatutPoste statutPoste, String presentationEntreprise, String presentationPoste) {
    }

    @Override
    public void supprimerFicheDePoste(Long idFicheDePoste) {
    }

    @Override
    public ArrayList<FicheDePoste> listerPostes() {
        return null;
    }

    @Override
    public void validerDemande(Long idDemande) {
    }

    @Override
    public ArrayList<Demande> listerDemandesACombler() {
        return null;
    }
    
    public FicheDePoste getFicheDePoste(Long idFicheDePoste){
        return facadeFicheDePoste.find(idFicheDePoste);
    }
}
