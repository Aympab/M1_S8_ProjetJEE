/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.ws;

import fr.miage.business.GestionEmploiLocal;
import fr.miage.entities.Demande;
import fr.miage.entities.FicheDePoste;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author aympa
 */

//Toujorus mettre string en paramètres
@WebService(serviceName = "NewWebService")
public class NewWebService {

    @EJB
    private GestionEmploiLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "creerFicheDePoste")
//    @Oneway
    public String creerFicheDePoste(@WebParam(name = "demandePoste") Demande demandePoste, @WebParam(name = "nomPoste") String nomPoste, @WebParam(name = "statutPoste") FicheDePoste.StatutPoste statutPoste, @WebParam(name = "presentationEntreprise") String presentationEntreprise, @WebParam(name = "presentationPoste") String presentationPoste) {
//        ejbRef.creerFicheDePoste(demandePoste, nomPoste, statutPoste, presentationEntreprise, presentationPoste);
        return "Blabla";
    }

    @WebMethod(operationName = "modifierFicheDePoste")
    @Oneway
    public void modifierFicheDePoste(@WebParam(name = "idFicheDePoste") Long idFicheDePoste, @WebParam(name = "demandePoste") Demande demandePoste, @WebParam(name = "nomPoste") String nomPoste, @WebParam(name = "statutPoste") FicheDePoste.StatutPoste statutPoste, @WebParam(name = "presentationEntreprise") String presentationEntreprise, @WebParam(name = "presentationPoste") String presentationPoste) {
        ejbRef.modifierFicheDePoste(idFicheDePoste, demandePoste, nomPoste, statutPoste, presentationEntreprise, presentationPoste);
    }

    @WebMethod(operationName = "supprimerFicheDePoste")
//    @Oneway
    public void supprimerFicheDePoste(@WebParam(name = "idFicheDePoste") String idFicheDePoste) {
        //Conversion en Long + virer les oneWay
        
        ejbRef.supprimerFicheDePoste(Long.parseLong(idFicheDePoste));
    }

    @WebMethod(operationName = "listerPostes")
    public ArrayList<FicheDePoste> listerPostes() {
        return ejbRef.listerPostes();
    }

    @WebMethod(operationName = "validerDemande")
    @Oneway
    public void validerDemande(@WebParam(name = "idDemande") Long idDemande) {
        ejbRef.validerDemande(idDemande);
    }

    @WebMethod(operationName = "listerDemandesACombler")
    public ArrayList<Demande> listerDemandesACombler() {
        return ejbRef.listerDemandesACombler();
    }
    
}
