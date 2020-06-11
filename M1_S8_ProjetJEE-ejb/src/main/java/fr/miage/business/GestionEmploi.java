/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.business;

import fr.miage.entities.Competence;
import fr.miage.entities.Demande;
import fr.miage.entities.Equipe;
import fr.miage.entities.FicheDePoste;
import fr.miage.repositories.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author aympa
 */
@Stateless
public class GestionEmploi implements GestionEmploiLocal {

    @EJB
    private ActeurFacadeLocal facadeActeur;// = new ActeurFacade();
    
    @EJB
    private DemandeFacadeLocal facadeDemande;// = new DemandeFacade();
    
    @EJB
    private FicheDePosteFacadeLocal facadeFicheDePoste;// = new FicheDePosteFacade();
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void creerFicheDePoste(String nomPoste, String presentationEntreprise, String presentationPoste) {
        FicheDePoste poste = new FicheDePoste();
        poste.setNomPoste(nomPoste);
        poste.setStatutPoste(FicheDePoste.StatutPoste.Active);
        poste.setPresentationEntreprise(presentationEntreprise);
        poste.setPresentationPoste(presentationPoste);
        
//        System.out.println(poste.toString() + "\n"+poste.getNomPoste());
        facadeFicheDePoste.create(poste);
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
    public Collection<Demande> listerDemandesACombler() {
        return facadeDemande.findAll();
    }
    
    @Override
    public FicheDePoste getFicheDePosteById(Long idFicheDePoste){
        return facadeFicheDePoste.find(idFicheDePoste);
    }

    @Override
    public void creerDemande(Equipe equipe, ArrayList<Competence> competencesDemandees) {
        Demande demande = new Demande();
        demande.setEquipeDemandeuse(equipe);
        demande.setCompetencesDemandees(competencesDemandees);
        
        facadeDemande.create(demande);
    }

    @Override
    public void modifierDemande(Long idDemande) {
    }
}
