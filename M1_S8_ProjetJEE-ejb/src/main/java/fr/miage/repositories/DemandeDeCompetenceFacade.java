/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.repositories;

import fr.miage.entities.DemandeDeCompetence;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aympa
 */
@Stateless
public class DemandeDeCompetenceFacade extends AbstractFacade<DemandeDeCompetence> implements DemandeDeCompetenceFacadeLocal {

    @PersistenceContext(unitName = "fr.miage_M1_S8_ProjetJEE-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DemandeDeCompetenceFacade() {
        super(DemandeDeCompetence.class);
    }
    
}