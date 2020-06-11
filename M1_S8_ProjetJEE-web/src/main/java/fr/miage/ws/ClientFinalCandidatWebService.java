/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.ws;

import fr.miage.entities.Acteur;
import fr.miage.entities.Candidature;
import fr.miage.entities.Candidature.StatutCandidature;
import fr.miage.entities.Demande;
import fr.miage.entities.FicheDePoste;
import fr.miage.services.ServiceGestionCandidat;
import java.util.ArrayList;
import java.util.Collection;
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
    private ServiceGestionCandidat ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "listerDemandesACombler")
    public Collection<Demande> listerDemandesACombler() {
        return ejbRef.listerDemandesACombler();
    }

    @WebMethod(operationName = "consulterFicheDePoste")
    public FicheDePoste consulterFicheDePoste(@WebParam(name = "idFicheDePoste") String idFicheDePoste) {
        return ejbRef.getFicheDePosteById(Long.parseLong(idFicheDePoste));
    }

    @WebMethod(operationName = "creerCandidature")
    public void creerCandidature(@WebParam(name = "candidat") String idCandidat, @WebParam(name = "poste") String idPoste) {

//        StatutCandidature parsedStatus = null;
//
//        switch (statut) {
//            case "2":
//                parsedStatus = StatutCandidature.Validee;
//                break;
//            case "1":
//                parsedStatus = StatutCandidature.Refusee;
//                break;
//            case "0":
//                parsedStatus = StatutCandidature.Active;
//                break;
//        }
        
        //TODO :
        //Faire un get sur le ID candidats pour récupérer le bon candidat
        Acteur candidat = ejbRef.getCandidatById(Long.parseLong(idCandidat));
        //Faire un get de la fiche de poste
        FicheDePoste poste = ejbRef.getFicheDePosteById(Long.parseLong(idPoste));
        ejbRef.creerCandidature(StatutCandidature.Active, candidat, poste);
    }

}
