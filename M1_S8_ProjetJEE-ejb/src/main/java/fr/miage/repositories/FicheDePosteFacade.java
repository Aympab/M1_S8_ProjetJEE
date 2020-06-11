package fr.miage.repositories;

import fr.miage.entities.FicheDePoste;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aympa
 */
@Stateless
public class FicheDePosteFacade extends AbstractFacade<FicheDePoste> implements FicheDePosteFacadeLocal {

    @PersistenceContext(unitName = "fr.miage_M1_S8_ProjetJEE-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FicheDePosteFacade() {
        super(FicheDePoste.class);
    }

    
    FicheDePoste find(Long id){
        FicheDePoste fdp = new FicheDePoste();
        fdp.setNomPoste("CoolPoste");
//        fdp.setId(id);
        return fdp;
    }
}
