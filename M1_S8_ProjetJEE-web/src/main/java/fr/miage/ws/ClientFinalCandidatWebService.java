/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.ws;

import fr.miage.entities.Acteur;
import fr.miage.entities.Candidature;
import fr.miage.entities.Demande;
import fr.miage.entities.FicheDePoste;
import fr.miage.services.GestionServiceCandidat;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author astrid
 */
@WebService(serviceName = "ClientFinalCandidatWebService")
public class ClientFinalCandidatWebService {

    @EJB
    private GestionServiceCandidat ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "listerDemandesACombler")
    public ArrayList<Demande> listerDemandesACombler() {
        return ejbRef.listerDemandesACombler();
    }

    @WebMethod(operationName = "consulterFicheDePoste")
    public FicheDePoste consulterFicheDePoste(@WebParam(name = "idFicheDePoste") String idFicheDePoste) {
        return ejbRef.consulterFicheDePoste(Long.parseLong(idFicheDePoste));
    }

    @WebMethod(operationName = "creerCandidature")
    @Oneway
    public void creerCandidature(@WebParam(name = "statut") Candidature.StatutCandidature statut, @WebParam(name = "candidats") Acteur candidat, @WebParam(name = "poste") FicheDePoste poste) {
        ejbRef.creerCandidature(statut, candidat, poste);
    }
    
}
