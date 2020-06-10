/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.ws;

import fr.miage.entities.Competence;
import fr.miage.services.ServiceGestionCodir;
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
@WebService(serviceName = "ClientFinalCodirWebService")
public class ClientFinalCodirWebService {

    @EJB
    private ServiceGestionCodir ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "listerCompetencesManquantes")
    public Collection<Competence> listerCompetencesManquantes() {
        return ejbRef.listerCompetencesManquantes();
    }

    @WebMethod(operationName = "validerCandidature")
    public void validerCandidature(@WebParam(name = "idCandidature") String idCandidature) {
        ejbRef.validerCandidature(Long.parseLong(idCandidature));
    }
    
}
