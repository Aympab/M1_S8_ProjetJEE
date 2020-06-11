package fr.miage.repositories;

import fr.miage.entities.Acteur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aympa
 */
@Stateless
public class ActeurFacade extends AbstractFacade<Acteur> implements ActeurFacadeLocal {

    @PersistenceContext(unitName = "fr.miage_M1_S8_ProjetJEE-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ActeurFacade() {
        super(Acteur.class);
    }
    
}
