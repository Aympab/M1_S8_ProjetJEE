/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.business;

import fr.miage.repositories.ActeurFacadeLocal;
import fr.miage.repositories.CandidatureFacadeLocal;
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
}
