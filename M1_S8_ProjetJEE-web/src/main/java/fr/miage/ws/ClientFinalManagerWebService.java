/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.ws;

import fr.miage.entities.Competence;
import fr.miage.entities.Equipe;
import fr.miage.services.ServiceGestionManager;
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
@WebService(serviceName = "ClientFinalManagerWebService")
public class ClientFinalManagerWebService {

    @EJB
    private ServiceGestionManager ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "listerCompetencesEquipe")
    public Collection<Competence> listerCompetencesEquipe(@WebParam(name = "idEquipe") String idEquipe) {
        return ejbRef.listerCompetencesEquipe(Long.parseLong(idEquipe));
    }

    @WebMethod(operationName = "createCompetence")
    public void createCompetence(@WebParam(name = "nomCompetence") String nomCompetence) {
        ejbRef.createCompetence(nomCompetence);
    }

    @WebMethod(operationName = "creerDemande")
    public void creerDemande(@WebParam(name = "equipe") Equipe equipe, @WebParam(name = "competencesDemandees") ArrayList<Competence> competencesDemandees) {
        // get equipe id and get equipe 
        // je sais pas comment faire pour la liste de competence 
        ejbRef.creerDemande(equipe, competencesDemandees);
    }
    
}
